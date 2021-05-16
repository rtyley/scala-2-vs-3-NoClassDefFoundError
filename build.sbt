scalaVersion := "2.13.5"

crossScalaVersions := Seq(scalaVersion.value, "2.12.13", "3.0.0")

libraryDependencies ++= Seq(
  "com.madgag" % "util-compress" % "1.33",
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

