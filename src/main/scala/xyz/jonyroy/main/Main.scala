package xyz.jonyroy.main


import akka.actor._
import xyz.jonyroy.basic.SimpleActor

object Main {

  def main(args: Array[String]): Unit = {

    val actorSystem: ActorSystem = ActorSystem("actor-system")

    val simpleActor: ActorRef = actorSystem.actorOf(Props[SimpleActor], "simple-actor")

    simpleActor ! 1
    simpleActor ! 2L
    simpleActor ! ""
    simpleActor ! 0.0124

    Thread.sleep(1000)
    actorSystem.terminate()
  }
}
