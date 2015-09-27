val commonSettings = Seq(
  organization := "$organization$",
  licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/$github_user$/$github_repo$/"),
    "scm:git:github.com:$github_user$/$github_repo$.git"
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
    name := "$name$",
    description := "$description_$"
  )
