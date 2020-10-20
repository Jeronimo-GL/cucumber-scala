ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.loygorri"

lazy val hello = (project in file("."))
  .settings(
    name := "Tests with Cucumber",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.0" % Test,
      "io.cucumber" %% "cucumber-scala" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-core" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-jvm" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-junit"  % "6.8.1" % Test,
      "com.novocode" % "junit-interface" % "0.11" % Test
    )
  )
