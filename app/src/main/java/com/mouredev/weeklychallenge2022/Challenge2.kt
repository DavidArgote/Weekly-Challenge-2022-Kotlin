package com.mouredev.weeklychallenge2022

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    println(fibonacci(50)?.joinToString(","))
    println()
    callFibonacciRecursive()
}

fun fibonacci(limit: Int): List<Long>? {
    if (limit < 0) return null
    val listValues = mutableListOf<Long>()
    listValues.add(0)
    listValues.add(1)

    for (i in 1 until limit) {
        listValues.add(listValues[i] + listValues[i - 1])
    }

    return listValues
}

fun callFibonacciRecursive() {
    println(fibonacciRecursive(0, 1, 50))
}

fun fibonacciRecursive(before: Long, current: Long, limit: Int) : Long {
    if (limit == 1) return current
    val newLimit = limit - 1
    return fibonacciRecursive(current, before + current, newLimit)
}

