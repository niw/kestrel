resolvers ++= Seq(
  "twitter" at "http://maven.twttr.com/"
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.2")

addSbtPlugin("com.twitter" %% "sbt-package-dist" % "1.1.0")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "3.1.5")
