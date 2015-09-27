import ReleaseTransformations._

releaseCrossBuild := true

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  ReleaseStep(action = Command.process("publishSigned", _), enableCrossBuild = true),
  setNextVersion,
  commitNextVersion,
  ReleaseStep(action = Command.process("sonatypeReleaseAll", _), enableCrossBuild = true),
  pushChanges
)

pomExtra := {
  <url>https://github.com/$github_user$/$github_repo$/</url>
  <developers>
    <developer>
      <id>$sonatype_id$</id>
      <name>$full_name$</name>
      <url>https://github.com/$github_user$</url>
    </developer>
  </developers>
}
