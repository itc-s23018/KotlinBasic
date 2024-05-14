package org.example

fun main(args: Array<String>) {
    //横は９→　１，　縦は　１→　９　の掛け算を表示してください。

    val x = 9 downTo 1
    val y = 1..9

    print("  ")
    for(xi in x){
        print("$xi ")
    }
    println()

    for(yi in y){
        print("$yi ")
        for (xi in x){
            print("${xi  * yi} ")
        }
        println()
    }
}