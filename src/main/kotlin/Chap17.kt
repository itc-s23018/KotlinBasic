package org.example

fun main(args: Array<String>) {

    println("----17.2----")
    val a2: List<Int> = listOf(1000, 1200, 1500)
    //インデックスを指定する
    println("1年目の時給は ${a2[0]}円です。")
    println("2年目の時給は ${a2[1]}円です。")
    println("3年目の時給は ${a2[2]}円です。")

    //forループ
    for(money in a2) {
        println("時給は${money}円です。")
    }

    //forループwithIndex
    for((index, money) in a2.withIndex()) {
        println("${index + 1}年目の時給は ${money}円です。")
    }

    println("----17.3----")
    val a3 = listOf<Boolean>(true,false,true)
    val b3 = listOf<Byte>(2,4,8,)
    val c3 = listOf<Short>(100, 101, 102)
    val d3 = listOf<Int>(1000, 1200, 1500)
    val e3 = listOf<Long>(100_000L, 1200_000L, 1500_000L)
    val f3 = listOf<Float>(1.0f, 1.1f, 1.2f)
    val g3 = listOf<Double>(1.0, 10.0, 100.0)
    val h3 = listOf<String>("こんにちは", "Kotlin", "よろしく")


    println("----17.7----")
    val a7: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    for((i,x) in a7.withIndex()) {
        println("$i : $x")
    }
    println("--------------")
//    a7.add("どうぞ")
//    a7.add("お願いします")
    a7 += "どうぞ"
    a7 += "お願いします"
    for((i, x) in a7.withIndex()) {
        println("$i : $x")
    }

    println("----17.8----")
    val a8 = mutableListOf("こんにちは", "Kotlin", "よろしく")
    a8.add(2, "どうぞ")
    a8.add(0, "はじめまして！")
    for((i,x) in a8.withIndex()) {
        println("$i : $x")
    }

    println("----17.9----")
    val a9 = mutableListOf("こんにちは", "Kotlin","どうぞ", "よろしく")
    a9.removeAt(2)
    for((i, x) in a9.withIndex()) {
        println("$i : $x")
    }
}