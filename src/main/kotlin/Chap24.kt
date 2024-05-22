package org.example.chap24

fun main(args: Array<String>) {
    val p = Person1()
    p.name = "たけし"
    p.age = 5
    p.greet()
    val n = p.name
    val a = p.age
    println("変数n の値: $n")
    println("変数a の値: $a")
}

class Person1 {
    var name: String = ""
    var age: Int = 0
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}

class Person3 {
    var age: Int = 20
        set(value) {
            println("${field}歳から ${value}歳になりました")
            if (value < field) {
                println(" -> なんt!若返りましたよ!")
            }else if (value > field) {
                println(" -> ああ、年を取るのは、嫌だなあ.")
            }
            field = value
        }
}