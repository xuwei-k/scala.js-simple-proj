scalaJSSettings

name := "App"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "2.3.8" withSources()
)

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "assets" / "runner.js"

