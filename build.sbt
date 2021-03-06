name := "procaas"

version := IO.read(new File("version.txt"))

scalaVersion := "2.12.9"

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "procaas"
  )

// META-INF discarding
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case x => MergeStrategy.last
}

test in assembly := {}

mainClass in assembly := Some("org.zella.procaas.Runner")

javaOptions in Test += "-Dscala.concurrent.context.numThreads=1 -Dscala.concurrent.context.maxThreads=1"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)
libraryDependencies += "com.github.zella" % "rx-process2" % "0.2.0-SNAPSHOT"
// https://mvnrepository.com/artifact/commons-io/commons-io
libraryDependencies += "commons-io" % "commons-io" % "2.6"
// https://mvnrepository.com/artifact/io.monix/monix-eval
libraryDependencies += "io.monix" %% "monix-eval" % "3.0.0"
// https://mvnrepository.com/artifact/io.monix/monix-reactive
libraryDependencies += "io.monix" %% "monix-reactive" % "3.0.0"
// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.3.3"
// https://mvnrepository.com/artifact/io.vertx/vertx-lang-scala-stack
libraryDependencies += "io.vertx" %% "vertx-lang-scala-stack" % "3.6.2" % "provided" pomOnly()
// https://mvnrepository.com/artifact/io.vertx/vertx-web-scala
libraryDependencies += "io.vertx" %% "vertx-web-scala" % "3.6.2"
// https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.8.1"
// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
// https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
// https://mvnrepository.com/artifact/com.github.pathikrit/better-files
libraryDependencies += "com.github.pathikrit" %% "better-files" % "3.7.0"
// https://mvnrepository.com/artifact/com.typesafe.play/play-json
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.0"
// https://mvnrepository.com/artifact/org.julienrf/play-json-derived-codecs
libraryDependencies += "org.julienrf" %% "play-json-derived-codecs" % "5.0.0"
// https://mvnrepository.com/artifact/org.apache.commons/commons-text
libraryDependencies += "org.apache.commons" % "commons-text" % "1.6"
// https://mvnrepository.com/artifact/org.apache.commons/commons-collections4
libraryDependencies += "org.apache.commons" % "commons-collections4" % "4.2"
// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
// https://mvnrepository.com/artifact/org.mockito/mockito-scala
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.0.8" % Test

libraryDependencies += "org.dispatchhttp" %% "dispatch-core" % "1.0.0" % Test
// https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client
libraryDependencies += "org.asynchttpclient" % "async-http-client" % "2.7.0" % Test

