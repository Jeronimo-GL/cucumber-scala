ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.loygorri"

lazy val hello = (project in file("."))
  .settings(
    name := "Tests with Selenium",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.0" % Test,
      "io.cucumber" %% "cucumber-scala" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-core" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-jvm" % "6.8.1" % Test,
      "io.cucumber" % "cucumber-junit"  % "6.8.1" % Test,
      "org.slf4j" % "slf4j-api" % "1.7.30", 
    )
  )

enablePlugins(CucumberPlugin)
 
CucumberPlugin.glues := List("com/waioeka/sbt/", "src/test")
/*
val params = List("default_summary", "html", "json", "junit",
     "message", "null_summary", "pretty", "progress", "rerun",
      "summary", "testng", "timeline", "unused", "usage")
val cucumberBasePath = "target/test-reports_2"
val pluginString = params.map(x => x + ":" + cucumberBasePath  + "/" + x).mkString(", ")
CucumberPlugin.envProperties := Map("cucumber.plugin" -> pluginString)
*/

CucumberPlugin.cucumberTestReports := new File(new File(target.value, "test-reports"), "cucumber")
