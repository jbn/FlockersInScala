name := "FlockersInScala"

version := "0.0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.7",
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test"
)

resolvers ++= Seq(
  "snapshots" at "http://scala-tools.org/repo-snapshots",
  "releases"  at "http://scala-tools.org/repo-releases"
)

scalacOptions += "-deprecation"

