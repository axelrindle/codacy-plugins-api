import sbt._

resolvers ++= Seq(DefaultMavenRepository,
                  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
                  Classpaths.typesafeReleases,
                  Classpaths.sbtPluginReleases)

// Sonatype publishing
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2-1")

// Dependency updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")

// Coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.15")
