package com.example.chap40

fun main(args: Array<String>) {

        val list = listOf(
            Person("タケシ",5),
            Person("ケンタ", 5),
            Person("ユミ", 8)
        )

    run{
            println("----40.1----")
            var pMax : Person? = null
            for(p in list){
                if(pMax == null || pMax.age < p.age){
                    pMax = p
                }
            }
            println(" 最年長なのは誰？")
            pMax?.greet()
        }

    run {
        println("----40.2----")
       val pMax = list.maxBy { it.age }
        println(" 最年長なのは誰？")
        pMax.greet()
    }

    run {
        println("----40.4----")
        val pMax = list.maxBy ( Person::age )
        println(" 最年長なのは誰？")
        pMax.greet()
    }
}

data class Person(val name: String, val age: Int){
    fun greet(){
        println("${name}です。${age}歳です。")
    }
}