name := "pyass"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.8"

// META-INF discarding
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case x => MergeStrategy.last
}

mainClass in assembly := Some("org.zella.pyass.Runner")

resolvers += "jwiki" at "https://dl.bintray.com/fastily/maven"

// https://mvnrepository.com/artifact/fastily/jwiki
libraryDependencies += "fastily" % "jwiki" % "1.7.0"
// https://mvnrepository.com/artifact/io.monix/monix-eval
libraryDependencies += "io.monix" %% "monix-eval" % "3.0.0-RC2"
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
// https://mvnrepository.com/artifact/org.apache.commons/commons-text
libraryDependencies += "org.apache.commons" % "commons-text" % "1.6" //https://stackoverflow.com/a/52695352/1996639
// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
// https://mvnrepository.com/artifact/org.mockito/mockito-scala
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.0.8" % Test
