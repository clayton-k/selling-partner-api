#!/bin/bash

basePackage="com.amazon.selling.partner"
basePath="/Users/clayton/git/selling-partner-api-models"
models=(${basePath}/models/*/*)

for model in "${models[@]}"
do
    java -jar ./swagger-codegen-cli-2.4.13.jar generate \
        --input-spec ${model} \
        --lang java \
        --template-dir ${basePath}/clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates \
        --output ../ \
        --invoker-package "${basePackage}" \
        --api-package "${basePackage}.api" \
        --model-package "${basePackage}.model" \
        --group-id "io.github.clayton-k" \
        --artifact-id "selling-partner-api" \
        --additional-properties dateLibrary=java8
done
