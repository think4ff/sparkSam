package org.kodb.spark

import org.apache.spark.{ SparkContext, SparkConf }
import org.apache.spark.SparkContext._

object First extends App {
  //setMaster는 argument로  받을수 있다.
  val conf = new SparkConf().setAppName("Frist").setMaster("local")
  val sc = new SparkContext(conf)
  
}