import sbt._
import Keys._

object ScalaBuild extends Build {

  organization := "net.danieldietrich"

  name := "scala-macros-kickstart"

  version := "0.1"

  scalaVersion := "2.10.0-RC2"

  // TODO: macros have to be in a different compilation unit
  lazy val root = Project("root", file("."))

}
