val commonSettings = Seq(
  organization := "$organization$",
  licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/tkawachi/$name$/"),
    "scm:git:github.com:tkawachi/$name$.git"
  )),

  scalaVersion := "$scala_version$",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint"
  ),

  doctestTestFramework := DoctestTestFramework.ScalaTest
) ++ scalariformSettings ++ doctestSettings

lazy val root = project.in(file("."))
  .settings(commonSettings :_*)
  .settings(
    name := "$name$"
  )
