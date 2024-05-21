package com.example.chap28

import com.example.chap27.Car5

fun main(args: Array<String>) {
    run{
        println("----28.4----")
        val car = Ferrari("赤")
        car.drive(100.0)
    }

    run{
        println("----28.6----")
        val car = Prius("グレー")
        car.drive(500.0)
    }

}

//28.2
class Ferrari(color:String) : Car5(color){
    //28.3
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています！ブウォォォーン！")
        println("おおっ！かっこいい！")
        println("マイレージは${distance}キロになったぜい!")
    }
}


//28.5
class Prius(color:String) : Car5(color){
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは${distance}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません!" )
    }
}