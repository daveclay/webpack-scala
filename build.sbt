organization := "com.daveclay"

name := "webpack-scala"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies += "com.bizo" % "mighty-csv_2.11" % "0.2"

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.4"

libraryDependencies += "com.google.inject" % "guice" % "3.0"

libraryDependencies += "com.google.inject.extensions" % "guice-servlet" % "3.0"

libraryDependencies += "commons-beanutils" % "commons-beanutils" % "1.9.2"

libraryDependencies += "org.jboss.resteasy" % "resteasy-jaxrs" % "3.0.10.Final"

libraryDependencies += "org.jboss.resteasy" % "jaxrs-api" % "3.0.10.Final"

libraryDependencies += "org.jboss.resteasy" % "resteasy-servlet-initializer" % "3.0.10.Final"

libraryDependencies += "org.jboss.resteasy" % "resteasy-guice" % "3.0.10.Final"

libraryDependencies += "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.5.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.5.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.5.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.5.0"

libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.4.4"

libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.4.4"

libraryDependencies += "org.scalastuff" % "scalabeans" % "0.3"

libraryDependencies += "com.google.api-client" % "google-api-client" % "1.18.0-rc"

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.10"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.10"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

// test dependencies

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.10.19" % "test"

libraryDependencies += "org.hamcrest" % "hamcrest-core" % "1.3" % "test"

libraryDependencies += "org.apache.derby" % "derby" % "10.11.1.1" % "test"

// "repositories" (maven, artifactory, etc)

resolvers += Resolver.bintrayRepo("earldouglas", "xsbt-web-plugin")
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

enablePlugins(JettyPlugin)

