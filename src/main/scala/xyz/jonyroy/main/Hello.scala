package xyz.jonyroy.main

import akka.actor._

object Hello extends Greeting with App {
  println(greetingOne)
}

trait Greeting {
  lazy val greeting: String = "hello"
  lazy val greetingOne: String = "hi"

  val v = 2
  val abc = "adslfkadsflkdf"

}


class TestActor extends Actor {

 override def receive: Receive = {
   case x: String => println("")
 }
}
