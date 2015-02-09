package com.wikia.codegen;

import com.wordnik.swagger.codegen.SupportingFile;
import com.wordnik.swagger.codegen.languages.JavaClientCodegen;

import java.io.File;

public class WikiaJavaClientCodegen extends JavaClientCodegen {
  public WikiaJavaClientCodegen() {
    super();
    invokerPackage = "com.wikia.nirvana";
    groupId = "com.wikia";
    artifactId = "nirvana-client";
    artifactVersion = "1.0.0";
    sourceFolder = "src/main/java";

    apiPackage = "com.wikia.nirvana.api";
    modelPackage = "com.wikia.nirvana.model";

    additionalProperties.put("invokerPackage", invokerPackage);
    additionalProperties.put("groupId", groupId);
    additionalProperties.put("artifactId", artifactId);
    additionalProperties.put("artifactVersion", artifactVersion);

    supportingFiles.clear();
    supportingFiles.add(new SupportingFile("pom.mustache", "", "pom.xml"));
    supportingFiles.add(
        new SupportingFile("apiInvoker.mustache",
                           (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "ApiInvoker.java"));
    supportingFiles.add(
        new SupportingFile("JsonUtil.mustache",
                           (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "JsonUtil.java"));
    supportingFiles.add(
        new SupportingFile("apiException.mustache",
                           (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "ApiException.java"));
  }
}
