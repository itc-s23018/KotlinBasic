package org.example

fun main(args: Array<String>) {
    println("----16.1----")
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    println("1年目の時給は　${a[0]}円です。")
    println("2年目の時給は　${a[1]}円です。")
    println("3年目の時給は　${a[2]}円です。")
    println("4年目の時給は　${a[3]}円です。")
    println("5年目の時給は　${a[4]}円です。")


    println("----16.3----")
    for(i in 0..4){
        println("${i+1}年目の時給は　${a[i]}円です。")
    }

    println("----16.4----")
    val a4: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000,3800)
    for (i in (0..4)){
        println("${i+1}年目の時給は　${a4[i]}円です。")
    }

    println("----16.5----")
    for(i in 0 ..<a4.count()) {
        println("${i + 1}年目の時給は　${a4[i]}円です。")
    }


    println("----16.6----")
    for(money in a4){
        println("時給 ${money}円です。")
    }

    println("----16.7----")
    for ((index, money) in a4.withIndex()){
        println("${index + 1}年目の時給は　${money}円です。")
    }

    println("----16.8----")
    val a8 = booleanArrayOf(true, false, true, true, false)
    val b8 = byteArrayOf(2,4,8,16,32)
    val c8 = shortArrayOf(100,101,102,103,104)
    val d8 = intArrayOf(1000,1200,1500,1800,2400)
    val e8 = longArrayOf(100_000, 120_000,1500_000,1800_000, 240_000)
    val f8 = floatArrayOf(1.0f, 1.1f, 1.2f, 1.3f, 1.4f)
    val g8 = doubleArrayOf(1.0, 10.0, 100.0, 1000.0, 10000.0)


    println("----16.9----")
    val h9 = arrayOf("こんにちは", "Kotlin", "どうぞ", "よろしく", "お願いします!")
    for( x in h9){
        println("String型の配列の値= $x")
    }
}