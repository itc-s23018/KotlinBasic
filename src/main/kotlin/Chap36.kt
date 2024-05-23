package com.example.chap36

fun main(args: Array<String>) {
    run {
        println("----36.1----")
        val p = Person1()
        p.greet()
    }

    run {
        println("----36.2----")
        val p = Person2()
        p.greet()
        p.greet2()
    }

    run{
        println("----36.3----")
        val p = Person3()
        p.setNameAndAge("タケシ", 5)
        p.greet()
    }
}

class Person1 {
    var name = "名無しさん"
    var age = 0
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person2 {
    var name = "名無しさん"
    var age = 0
    fun greet() {
        val name = "ひろし"
        val age = 46
        println("${name}です。${age}歳です。")
    }
    fun greet2() {
        println("${name}です。${age}歳です。")
    }
}


class Person3 {
    var name = ""
    var age = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

