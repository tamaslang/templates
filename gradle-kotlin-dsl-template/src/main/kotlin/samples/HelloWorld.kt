package samples

fun main(args: Array<String>) {
    println(sayHello("World"))
}

fun sayHello(name: String = "") = "Hello $name".trimEnd()
