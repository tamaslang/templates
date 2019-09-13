package example

object Hello extends Greeting with App {
  println(sayHello("World"))
}

trait Greeting {
  def sayHello(name: String = "") = s"Hello $name".trim()
}
