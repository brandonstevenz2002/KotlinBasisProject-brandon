package edu.unicatolica.kotlin

fun section1(title: String) {
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))
}

fun main() {
    section1("Notas de las asignaturas")

    println("Ingrese la nota de la primera asignatura:")
    val nota1 = readLine()!!.toDouble()

    println("Ingrese la nota de la segunda asignatura:")
    val nota2 = readLine()!!.toDouble()

    println("Ingrese la nota de la tercera asignatura:")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    section1("Resultado")
    println("Notas: $nota1, $nota2, $nota3")
    println("Promedio: %.2f".format(promedio))

    if (promedio >= 3.0) {
        println("Aprobaste")
    } else {
        println("Reprobaste")
    }
}
