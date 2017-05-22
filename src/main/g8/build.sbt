val commonSettings = Seq(
  organization := "$organization$",
  licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/$github_user$/$github_repo$/"),
    "scm:git:github.com:$github_user$/$github_repo$.git"
  )),

  scalaVersion := "$scala_version$",
  crossScalaVersions := Seq("2.11.11", "$scala_version$"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint"
  )
)

lazy val root = project.in(file("."))
  .settings(commonSettings :_*)
  .settings(
    name := "$name$",
    description := "$description_$",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.3" % "test",
      "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
    )
  )
