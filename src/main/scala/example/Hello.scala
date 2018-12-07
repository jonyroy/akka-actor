package example

object Hello extends Greeting with App {
  println(greetingOne)
}

trait Greeting {
  lazy val greeting: String = "hello"
  lazy val greetingOne: String = "hi"

  val v = 2

  val v = 5

}
