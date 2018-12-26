name := "finch-rest-api"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.26.0",
  "com.github.finagle" %% "finch-circe" % "0.26.0",
  "io.circe" %% "circe-generic" % "0.11.0"
)
