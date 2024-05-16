package org.example

fun main(args: Array<String>) {
    run {
        println("----23.4-----")
        val  p = Person3()
    }

    run{
        println("----23.5-----")
        val p = Person3()
        p.name = "タケシ"
        p.age = 5
        p.greet()
    }

    run {
        println("----23.6-----")
        val p1 = Person3()
        p1.name = "タケシ"
        p1.age = 5

        val p2 = Person3()
        p2.name = "ケンタ"
        p2.age = 6

        val p3 = Person3()
        p3.name = "ユミ"
        p3.age = 8

        p1.greet()
        p2.greet()
        p3.greet()
    }
}

//名前以外何も決めないクラス
class Person1

//プロパティ（属性）だけ定義した
class Person2{
    var name = ""
    var age = 0
}

//プロパティとメゾット（関数）を定義したクラス
class Person3 {
    var name = ""
    var age = 0
    fun greet () {
        println("こんにちは、私の名前は${name}です。 年齢は${age}才です。")
    }
}