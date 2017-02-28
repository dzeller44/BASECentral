import sbt.Keys._

name := "BASE Central"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.typesafe.play" %% "play-mailer" % "3.0.1",
  "mysql" % "mysql-connector-java" % "5.1.34",
  filters,
  javaWs
)

resolvers ++= Seq(
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots",
    "Typesafe repository" at "https://repo.typesafe.com/typesafe/maven-releases/"
)
routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8", "-Xlint:-options")

scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature")

fork in run := false