name := "sparkWordCount"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.4.1"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.4.1"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "1.4.1"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "1.4.1"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0-M7"
