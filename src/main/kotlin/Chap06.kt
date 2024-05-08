package org.example

fun main(args: Array<String>) {
    val num = 100
    val a: Boolean = (num == 100)
    val b: Boolean = (num == 125)
    println("変数aの値は　$a　です。")
    println("変数bの値は　$b です。")

    println("----6.6----")
    val num61 = 5
    val num62 = 10
    val a6 = (num61 < num62)
    val b6 = (num61 > num62)
    println("num1がnum2より小さい:$a")
    println("num1がnum2より大きい:$b")
}