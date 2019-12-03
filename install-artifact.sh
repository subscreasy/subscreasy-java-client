#!/usr/bin/env bash

mvn install:install-file \
	-DgroupId=com.kodfarki.subscreasy \
	-DartifactId=subscreasy-java-client \
	-Dversion=1.1.112 \
	-Dfile=/Users/halil/Projects/abonelik-sihirbazi/src/github/subscreasy-java-client/target/subscreasy-java-client-1.1.112.jar \
	-DpomFile=/Users/halil/Projects/abonelik-sihirbazi/src/github/subscreasy-java-client/pom.xml \
	-DlocalRepositoryPath=/Users/halil/Projects/abonelik-sihirbazi/src/github/maven \
	-Dpackaging=jar \
	-DgeneratePom=true \
	-DcreateChecksum=true
