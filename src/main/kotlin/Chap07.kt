package org.example

fun main(args: Array<String>) {
    val delicious2 = true
    val cheap2 = true
    val letsEat2 = (delicious2 && cheap2)
    println("食事する？:$letsEat2")

    val delicious3 = true
    val cheap3 = false
    val letsEat3 = delicious3 && cheap3
    println("食事する？:$letsEat3")

    val delicious4 = false
    val cheap4 = true
    val letsEat4 = delicious4 && cheap4
    println("食事する:$letsEat4")

    val delicious5 = false
    val cheap5 = false
    val letsEat5 = delicious5 && cheap5
    println("食事する？:$letsEat5")


    println("----7.6----")
    val delicious6 = true
    val cheap6 = true
    val letsEat6 = (delicious6 || cheap6)
    println("食事する？:$letsEat6")

    val delicious7 = true
    val cheap7 = false
    val letsEat7 = delicious7 || cheap7
    println("食事する？:$letsEat7")

    val delicious8 = false
    val cheap8 = true
    val letsEat8 = delicious8 ||cheap8
    println("食事する:$letsEat8")

    val delicious9 = false
    val cheap9 = false
    val letsEat9 = delicious9 || cheap9
    println("食事する？:$letsEat9")

    println("----7.10----")
    val x10 = 75
    val a10 = (x10 >50 && x10 <= 100)
    val b10 = (x10 <50 || x10 > 100)
    println("変数xが50から100の範囲内にある:$a10")
    println("変数xが50から100の範囲外にある:$b10")

    println("----7.12----")
    val a12 = true
    val b12 = !a12
    val c12 = !b12
    println("aの値は　$a12 です。")
    println("bの値は　$b12 です。")
    println("cの値は　$c12 です。")

}