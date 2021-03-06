import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "akka-actor",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.18"
