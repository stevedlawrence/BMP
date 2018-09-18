name := "dfdl-bmp"

organization := "com.mitre"

version := "0.0.1"

crossPaths := false

scalaVersion := "2.11.12"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml" % "2.2.0" % "test"
)

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/DFDLSchemas/bmp"),
    connection = "scm:git:https://github.com/DFDLSchemas/bmp.git")
  )

homepage in ThisBuild := Some(url("https://github.com/DFDLSchemas/bmp"))
