package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello to input name" in {
    val inputName = "John"
    Hello.sayHello(inputName) shouldEqual "Hello John"
  }

  "The Hello object" should "say hello to empty input name" in {
    val inputName = ""
    Hello.sayHello(inputName) shouldEqual "Hello"
  }

  "The Hello object" should "say hello to empty input name by default" in {
    Hello.sayHello() shouldEqual "Hello"
  }
}
