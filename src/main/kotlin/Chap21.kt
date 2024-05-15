package org.example

import kotlin.time.TimedValue

fun main(args: Array<String>) {
    val answer : Int = getThreeTimes(5)
//    val answer2 : Int = getThreeTimes(5.2) //コンパイルエラー
//    val answer3 : Double = getThreeTimes(5)  //コンパイルエラー

    println(answer)

    run {
        val answer : Int = getTimes(2, 3)
        println(answer)
    }

//    run {
//        println("----21.11----")
//        val answer : UInt = getTimes(3, 5, 4)
//        println("変数　answerの値は、$answer　です。")
//    }

    run {
        println("----21.13----")
        printTimes(2,3,4)
        printTimes(5,10, 8)
        printTimes(1, 2, 100)
    }

    run{
        println("----21.14--")
        printTimes(2,3)
        printTimes(5,10,20)
        printTimes(1,10,100,1000)
        printTimes(2,2,2,2,2,2,2,2,)
    }

}

/* // 21.1
fun getThreeTimes(value: Int) : Int {

    return value * 3
}

 */

// 21.5
fun getThreeTimes(value: Int): Int = value * 3

//21.8

fun getTimes(x:Int , y:Int ) = x * y

//21.11
fun getTimes(x: Int , y: Int, z: Int ) {
    println("パラメータとして、$x と　$y と $z　を受け取りました。")
    println("これらの値を全部掛け算した答えは${x * y * z}です。")
}

//21.13
fun printTimes(x: Int, y: Int, z: Int) {
    println("-----------------------------------------------")
    println("パラメータとして、$x と　$y と $z　を受け取りました。")
    println("これらの値を全部掛け算した答えは${x * y * z}です。")
    println("-----------------------------------------------")
}

fun printTimes(vararg numbers: Int) {
    var lesult = 1
    for (x in numbers) {
        lesult *= x
    }
    println("すべての数値を掛け算した結果:$lesult")
}