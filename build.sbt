ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.loygorri"

lazy val hello = (project in file("."))
  .settings(
    name := "Tests with Selenium",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.0" % "test")
  )