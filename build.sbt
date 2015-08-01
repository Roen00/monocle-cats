organization := "com.dragisak"

name := "monocle-cats"

scalaVersion := "2.11.7"

val catsVersion = "0.1.2"

val monocleVersion = "1.1.1"

libraryDependencies ++= Seq(
  "org.spire-math"              %% "cats"           % catsVersion,
  "com.github.julien-truffaut"  %% "monocle-core"   % monocleVersion,
  "com.github.julien-truffaut"  %% "monocle-macro"  % monocleVersion  % Test,
  "org.spire-math"              %% "cats-laws"      % catsVersion     % Test,
  "org.scalatest"               %% "scalatest"      % "2.2.4"         % Test

)

addCompilerPlugin("org.scalamacros" %% "paradise" % "2.0.1" cross CrossVersion.full)
