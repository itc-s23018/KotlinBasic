package org.example

fun main(args: Array<String>) {
    print("点数を入力してください:")
    val score = readln().toInt()

    //成績判定
    //0 ~ 59は　D
    //60 ~ 69は C
    //70 ~ 79は B
    //80 ~ 89は A
    //90 ~ 100は S
    //それ以外は「エラー」と出力


    val rank= when(score) {
        in 0..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..89 -> "A"
        in 90..100 ->"S"
        else -> "エラー"
    }
    println(rank)

}