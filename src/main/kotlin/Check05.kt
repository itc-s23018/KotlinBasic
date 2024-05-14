package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    //Check03で作ったプログラムが、本当に確率通りか試してみる
    print("試行回数？: ")
    val count = readln().toInt()

    // 勝ち ・　負け・　あいこの数を数える変数を用意する
    var win = 0
    var lose = 0
    var draw = 0

    for(i in 0 ..<count) {
        val player = Random.nextInt(1..3)
        print("1:グー 2:チョキ　3:パー を選びました: $player")


        //乱数で勝敗を決める
        val (result, judge) = when (Random.nextInt(0..<100)) {
            in 0..<10 -> {
                win++
                Pair(1, "かち")
            }
            in 10..<15 -> {
                draw++
                Pair(0, "あいこ")
            }
            else -> {
                lose++
                Pair(2, "まけ")
            }
        }

        //CPUの手を計算で求める
        val cpu = (player + result) % 3




        //結果表示
        println("Cpu: ${cpu + 1} --- $judge")
    }

    println("確率の結果")
    println("勝ち: $win (${win / count.toDouble() * 100}%)")
    println("負け: $lose (${lose / count.toDouble() * 100}%)")
    println("あいこ : $draw (${draw / count.toDouble() * 100}%)")
}