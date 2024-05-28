package com.example.chap44

fun main() {
    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    println(message)
}

fun String.getOneTwoFiveMessage() = "一に${this}、二に${this}、三、四が無くて五に${this}"

