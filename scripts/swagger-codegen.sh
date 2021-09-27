#!/bin/bash

basePackage="com.amazon.selling.partner"
basePath="/Users/clayton/git/selling-partner-api-models"
models=(${basePath}/models/*/*)

if [ ! -d "spapi" ]; then
    mkdir spapi;
fi

subPackage=""

function getSubPackage() {
    local str1=${1%/*}
    local str2=${str1##*/}
    local str3=${str2/-api-model/}
    subPackage=${str3//-/.}
}

for model in "${models[@]}"
do
    echo $model
    getSubPackage $model
    echo $subPackage
    java -jar ./swagger-codegen-cli-2.4.13.jar generate \
        --input-spec ${model} \
        --lang java \
        --template-dir ${basePath}/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates \
        --output spapi \
        --invoker-package "${basePackage}" \
        --api-package "${basePackage}.api" \
        --model-package "${basePackage}.model.${subPackage}" \
        --group-id "io.github.clayton-k" \
        --artifact-id "selling-partner-api" \
        --additional-properties dateLibrary=java8
done
