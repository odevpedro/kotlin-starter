fun calculeBonification(a: Int, b: Int, c: Int)  {
    println("The bonus is:  ${a + b + c}")
}

fun hello(name: String) : String {
    return "ola, $name"
}

//one line function
fun hello2(name: String) = "Hello, $name"

fun main() {

calculeBonification(10, 20, 20)
    hello("hi")
}

