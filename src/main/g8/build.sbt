// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4"
    )),
    name := "$name$",
    libraryDependencies ++= Seq(
      "com.lihaoyi" % "ammonite" % "$ammonite_version$" cross CrossVersion.full,
      "com.lihaoyi" %% "ammonite-ops" % "$ammonite_version$"
    )
  )
