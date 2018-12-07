package xyz.jonyroy.basic


import akka.actor._


class SimpleActor extends Actor {

  override def receive: Receive = {
    case msg: String => println(s"Hey You send me a String type Message.")
    case int: Int =>  println(s"Hey You send me a Int type Message.")
    case long: Long =>  println(s"Hey You send me a Long type Message.")
    case float: Float =>  println(s"Hey You send me a Float type Message.")
    case double: Double =>  println(s"Hey You send me a Double type Message.")
    case boolean: Boolean =>  println(s"Hey You send me a Boolean type Message.")
    case _ =>  println(s"Hey You send me an Unknown type Message.")
  }
}
