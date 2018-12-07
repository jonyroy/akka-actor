package xyz.jonyroy.lifecycle

import akka.actor._

class ActorLifeCycle extends Actor {

  override def preStart(): Unit = {
    println("ActorLifeCycle Actor Started.")
  }

  override def postStop(): Unit = {
    println("ActorLifeCycle Actor Stopped.")
  }


  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    super.preRestart(reason,message) // stops all children, calls postStop( ) for crashing actor
    println(s"actor restarting...")
  }


  override def postRestart(reason: Throwable): Unit = println(s"actor restarted...")



  override def receive: Receive = {
    case msg: String => println("Testing Akka Actor Life Cycle.")
  }
}
