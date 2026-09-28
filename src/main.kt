fun main() {
    println("Hello World!")

    /* 1. int */
    val x = 5
    println("The value of x is: $x")

    /* 2. float */
    val y = 10.123456F
    println(y)

    // Double
    // Boolean
    // string
    var a: String = "Bye bye World!"
    println(a)

    val sherin = 10
    val george = 20
    println(sherin*george) //Arithmetic Operators -> *, /, +, -, %
    //println(sherin==george) //Comparison Operators -> ==, >=, <=
    //println("Are both even numbers? ${sherin % 2 == 0 && george % 2 == 0}") //Logical Operators

    //Console Input
//    println("Please enter a number: ")
//    val input = readln().toInt();
//    println("You have entered: $input")
//    println("Is the entered number an even number? ${input % 2 == 0} ")

    //Nullability or Null safe operators
    val fName = readln()
    val firstName: String? = fName
    val experience = 5
    val target = "Android Developer"

    println("Name: $firstName")
    println("Experience: $experience")
    println("Target: $target")
}