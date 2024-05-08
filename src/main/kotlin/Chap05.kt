package org.example

fun main(args: Array<String>) {
//    val a: Char = 'え'
//    val b: Char = 'び'
//    val c: Char = 'し'
//
//    val message: String = "こんにちは、世界！"
//
//    println(a)
//    println(b)
//    println(c)
//    println(message)
//
//    println("----5.5----")
//    val a5 = "こんにちは、"
//    val b5 = "世界！"
//    val message5 = a5 + b5
//    println(message5)
////    println(a5 + b5)
//    println("こんにちは、$b5")

    println("----5.8----")
    val h: Int = 8
    println("本日働いた時間は、${h}hours")
    println("このペースで1ヶ月働くと、${h * 30}hours　の労働になります")
    println("このペースで１年間働くと、${h * 365}hours の労働になります")

    println("----5.12----")
    val message12 = """|
        |こんにちは、世界！
        |私はKotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
        """.trimMargin()
    println(message12)

    val message13 = """
        こんにちは、世界！
        私はKotlinに関して勉強しています
        Kotlinでは、とても簡潔なプログラムを書くことができます。
        皆さん、一緒に楽しくプログラミングしましょう。
    """.trimIndent()
    println(message13)
}