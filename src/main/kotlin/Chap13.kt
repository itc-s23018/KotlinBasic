package org.example

fun main(args: Array<String>) {
    println("----13.2----")
    val x = 5
    for(i in 1 .. 9){
        println("${x}かける${i}は、${x * i}です。")
    }

    println("----13.5----")
    for(i in 800..1000 step 3){
        println("${x}かける${i}は、${x*i}です。")
    }

    println("----13.7----")
    for(i in 9 downTo 1){
        println("${x}かける${i}は、${x*i}です。")
    }

    println("----13.8----")
    for(i in 9 downTo 1 step 2){
        println("${x}かける${i}は、${x*i}です。")

    }
}