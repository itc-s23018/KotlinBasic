package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    print("1:グー 2:チョキ　3:パー を選んでください。:")
    val player = readln().toInt() -1

    //CPUのランダムを決める
    val cpu = Random.nextInt(0, 3)//0,1,2のどれかになる
    println("Player:${player + 1} VS CPU:${cpu + 1}")

    //勝敗判定
//   val judge =  when{
//       player == cpu -> "あいこ"
//       player <= cpu || player == 2 && cpu == 0-> "勝ち"
//       player == 1 && cpu == 3 -> "負け"
//       else -> "負け"
//    }
//    println(judge)

    //別の方法

    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "かち"
        2 -> "負け"
        else -> "?"
    }

    println(judge)
}