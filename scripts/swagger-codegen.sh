#!/bin/bash

# ************************************************
# Amazon Selling Partner Api code generator script
# Powered by Clayton
# ************************************************

codegenDir=$(pwd)
basePackage="com.amazon.selling.partner"
modelsPath="${codegenDir}/selling-partner-api-models/"
outputPath="${codegenDir}/../"
libPath="${outputPath}/lib/"

groupId="com.amazon"
artifactId="selling-partner-api"
# update the following version before running this script, and update the version in the pom file after running this script.
artifactVersion="1.0.0-2021.09.30"

subPackage=""

mkdir -p "${outputPath}";
mkdir -p "${libPath}";

# step 1: clone or update models code
if [ ! -d "${modelsPath}" ]; then
    echo "Cannot find models source code, start cloning repository from https://github.com/amzn/selling-partner-api-models.git into directory \"${modelsPath}\"";
    git clone https://github.com/amzn/selling-partner-api-models.git "${modelsPath}";
else
    cd "${modelsPath}" && git fetch;
fi

# step 2: generate api client jar file and copy into current project as third party local jar.
mvn clean package -f "${modelsPath}"/clients/sellingpartner-api-aa-java/pom.xml
cp "${modelsPath}"/clients/sellingpartner-api-aa-java/target/sellingpartnerapi-aa-java-1.0-jar-with-dependencies.jar "${libPath}"/sellingpartnerapi-aa-java-1.0-jar-with-dependencies.jar

# step 3: generate selling partner api code
function getSubPackage() {
    # substring from the first character to the last index of "/" (not included). eg. a/b/c/d/fba-inventory-api-model/fbaInventory.json => a/b/c/d/fba-inventory-api-model
    local str1=${1%/*}
    # substring from the last index of "/" to the end. eg. a/b/c/d/fba-inventory-api-model => fba-inventory-api-model
    local str2=${str1##*/}
    # replace "-api-model". eg. fba-inventory-api-model => fba-inventory
    local str3=${str2/-api-model/}
    # replace "-" with ".". eg. fba-inventory => fba.inventory
    subPackage=${str3//-/.}
}

cp "${outputPath}"/.gitignore "${outputPath}"/.gitignore.bak

# clean up docs
rm -rf "${outputPath}"/docs/*

models=("${modelsPath}"/models/*/*)

for model in "${models[@]}"
do
    echo "$model"
    getSubPackage "$model"
    echo "$subPackage"
    java -jar "${codegenDir}"/swagger-codegen-cli-2.4.13.jar generate \
        --input-spec "${model}" \
        --lang java \
        --template-dir "${modelsPath}"/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates \
        --output "${outputPath}" \
        --invoker-package "${basePackage}" \
        --api-package "${basePackage}.api.${subPackage}" \
        --model-package "${basePackage}.model.${subPackage}" \
        --group-id "${groupId}" \
        --artifact-id "${artifactId}" \
        --artifact-version "${artifactVersion}" \
        --additional-properties dateLibrary=java8
    # copy documents to sub packages in case duplicate document names replacement
    temp="${outputPath}/temp/${subPackage//.//}"
    mkdir -p "${temp}";
    mv "${outputPath}"/docs/* "${temp}"
done

mv "${outputPath}"/temp/* "${outputPath}"/docs
rm -d "${outputPath}"/temp

mv "${outputPath}"/.gitignore.bak "${outputPath}"/.gitignore

# step 4: generate selling partner api jar file
cd "${outputPath}" && mvn clean package -Dmaven.test.skip
