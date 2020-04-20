scalaVersion := "2.12.11"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.6.0",
  "com.ironcorelabs" %% "cats-scalatest" % "2.3.1" % "test",
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
)
