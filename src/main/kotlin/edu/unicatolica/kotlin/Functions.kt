package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max
import kotlin.math.sign

fun section (title: String) {
    println("\n" + "=".repeat( n = 75))
    println(title)
    println("\n" + "=".repeat( n = 75))
}

fun variablesAndTypes(){
    val lang: String = "Kotlin"
    var counter = 0
    println("val lang = $lang")
    println("val counter = $counter")

    counter += 3
    println("counter after += 3 => $counter")
}

fun conditionalAsExpression(n: Int){
    section( title = "(2) conditional as Expression & when")

    val parity = if (n % 2 == 0) "even" else "add"
    println("n=$n is $parity")

    val description = when {
        n == 0 -> "zero"
        n in 1..9 -> "one digit positive"
        n < 0 -> "negative"
        else -> "Positive (>=10)"
    }

    println("Description: $description")
}

fun LoopsDemo(){
    section( title = "3) Loops: for /while / do-while")

    //allways use while you know the range of the elements
    println("for i to 5: ")
    for (i in 1.. 5) println("$i ")
    println()

    val list  = listOf("a", "b", "c")
    println("for over list: ")
    for(x in list) println("$x")
    println()

    // use  when you don´t know the range of elements
    //but you know a stap condition

    var x = 3
    println("while x>0 ")
    while(x>0) {
        print("$x ")
        x--
    }

    println()

    // runs at leas once
    var y = 0
    println("do-while y<1: ")
    do {
        println("$y" )
        y++
    }while(y < 1)
    println()
}

fun main() {
    variablesAndTypes()
    conditionalAsExpression(6)
    LoopsDemo()
}