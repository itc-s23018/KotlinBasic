package com.example.chap30



fun main(args: Array<String>) {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    val car3 = Xbee("イエロー")
    car1.drive(10.0)
    car2.drive(10.0)
    car3.drive(10.0)

}

abstract class Car(val color: String){
    var distance = 0.0
    abstract fun drive(d:Double)
}

class Ferrari(color: String) : Car(color){
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています！ブウォォォーン！")
        println("おおっ！かっこいい！")
        println("マイレージは${distance}キロになったぜい!")
    }
}

class Prius(color: String) : Car(color){
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは${distance}キロです。トヨタの車はいっぱい走ってもなかなか故障しません!" )
    }
}

class Xbee(color: String) : Car(color){
    override fun drive(d: Double) {
        distance += d
        println("${color}のクロスビーが走りました")
        println("マイレージは${distance}キロになりました。")
    }
}