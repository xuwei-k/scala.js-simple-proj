scalaJSSettings

name := "Main"

version := "0.1-SNAPSHOT"

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "runner.js"
