fun main() {
    // Arithmetic operations
    val a = 10
    val b = 20
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // Comparison operations
    val c = 30
    val isEqual = (a == c)
    val isNotEqual = (a != c)
    val isGreaterThan = (a > c)
    val isLessThan = (a < c)
    val isGreaterThanOrEqual = (a >= c)
    val isLessThanOrEqual = (a <= c)

    println("a is equal to c: $isEqual")
    println("a is not equal to c: $isNotEqual")
    println("a is greater than c: $isGreaterThan")
    println("a is less than c: $isLessThan")
    println("a is greater than or equal to c: $isGreaterThanOrEqual")
    println("a is less than or equal to c: $isLessThanOrEqual")

    // Logical operations
    val d = true
    val e = false
    val f = !d
    val g = (d && e)
    val h = (d || e)

    println("d: $d")
    println("e: $e")
    println("f (not d): $f")
    println("g (d and e): $g")
    println("h (d or e): $h")
}