package org.example

import java.util.Random

fun main(args: Array<String>) {
    println("----15.2----")
    while (true){
        val value1 = Random().nextInt(100)
        val value2 = Random().nextInt(100)
        println("乱数1:$value1 乱数2:$value2")
        if(value1 < 10 && value2 >=  90)break
    }



    println("----15.6----")
    for(x in 1..20){
        if (x % 3 == 0) break
        println("${x}回目の繰り返し処理")
    }

    println("----15.7----")
    for(x in 1..20){
        if (x % 3 == 0) continue
        println("${x}回目の繰り返し処理")
    }
}