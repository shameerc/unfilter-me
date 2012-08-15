import com.twitter.sbt._

seq(StandardProject.newSettings: _*)
 
packageDistZipName := "cf-unfiltered-sample.zip"

organization := "com.example"

name := "unfilter-me"

version := "0.1.0"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.4",
  "net.databinder" %% "unfiltered-jetty" % "0.6.4",
  "org.clapper" %% "avsl" % "0.3.6",
  "org.fusesource.scalate" % "scalate-core" % "1.5.2",
  "net.databinder" %% "unfiltered-spec" % "0.6.4" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)