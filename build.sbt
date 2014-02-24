// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

name := "Example"

version := "0.1-SNAPSHOT"

//libraryDependencies ++= Seq(
//    "com.lihaoyi.utest" % "utest_2.10" % "0.1.1"
//)
unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "startup.js"
