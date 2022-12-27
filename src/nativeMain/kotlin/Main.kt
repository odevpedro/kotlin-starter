fun main() {
    val x = 10

    // if-else statement
    if (x > 0) {
        println("x is positive")
    } else {
        println("x is negative or zero")
    }

    // when expression
    when (x) {
        in 1..10 -> println("x is in the range 1 to 10")
        !in 11..20 -> println("x is not in the range 11 to 20")
        else -> println("x is outside the range 1 to 20")
    }

    // for loop
    for (i in 1..5) {
        println(i)
    }

    // while loop
    var y = 10
    while (y > 0) {
        println(y)
        y--
    }

    // do-while loop
    do {
        println(y)
        y++
    } while (y < 10)


    //elvis operator
    val test: Int? = null
    val op: Int = test ?: 100
    print(op) //return 100


    //elvis operator
    /*
    var test: Int? = null
    test = 10
    val op: Int = test ?: 100

    print(op) //rrturn 10
*/
}