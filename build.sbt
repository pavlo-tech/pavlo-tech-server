ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "pavlo-tech",
    libraryDependencies ++=Seq(
      "com.twitter" %% "finagle-http" % "22.4.0"
    )
  )

