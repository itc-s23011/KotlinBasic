package org.example

fun main(array: Array<String>) {
    val delicious = true
    val cheap = false
    println("このレストランはおいしい : $delicious")
    println("このレストランはやすい : $cheap")


    val delicious2 = true
    val cheap2 = false
    val letsEat2 = (delicious2 && cheap2)
    println("食事する? : $letsEat2")
    val delicious3 = true
    val cheap3 = false
    val letsEat3 = delicious3 && cheap3
    println("食事する? : $letsEat3")
    val delicious4 = true
    val cheap4 = false
    val letsEat4 = (delicious4 && cheap4)
    println("食事する? : $letsEat4")
    val delicious5 = true
    val cheap5 = false
    val letsEat5 = (delicious5 && cheap5)
    println("食事する? : $letsEat5")
    val x10 = 75
    val a10 = (x10 >= 50 && x10 <= 100)
    val b10 = (x10 < 50 || x10 > 100)
    println("変動　x10 が50から100の範囲内にある : $a10")
    println("変動　x10 が50から100の範囲外にある : $b10")

    val a12 = true
    val b12 = !a12
    val c12 = !b12
    println("a12 の値は $a12 です。")
    println("b12 の値は $b12 です。")
    println("b12 の値は $c12 です。")

}





