scalaJSSettings

name := "App"

version := "0.1-SNAPSHOT"

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "assets" / "runner.js"