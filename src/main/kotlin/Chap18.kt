package org.example

import kotlin.time.measureTime

fun main(args: Array<String>) {
    run {
        println("---18.1----")
        var s: Set<String> = setOf("あ","い", "う","え","お")
        s += "か"
        s += "き"
        s += "く"
        println(s)
    }
    run {
        println("----18.2----")
        val s = mutableSetOf("あ","い","う","え","お")
        s += "か"
        s += "き"
        s += "く"
        s += "い"
        s += "か"
        println(s)
    }
    val charList = 'a' ..'z'
    val serchCharList = mutableListOf('z','x','c','v','b','n','m')
    val serchCharset = mutableSetOf('z','x','c','v','b','n','m')
    val count = 1_000_000_000L
    val listTime = measureTime {
        for (i in 0..<count) {
            val target = charList.shuffled()[0]
            println("「${target}」は存在する? : ${target in serchCharList}")
        }
        val setTime = measureTime {
            for (i in 0..<count) {
                val target =charList.shuffled()[0]
                println("「${target}」は存在する? : ${target in serchCharset}")
            }
        }
        println("Listでかかった時間 : $charList")
        println("Setでかかった時間 : $setTime")
    }
}