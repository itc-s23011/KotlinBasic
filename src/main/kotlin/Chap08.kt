package org.example

fun main(array:Array<String>) {
    val original: Int = 100

    val a: Byte = original.toByte()
    val b: Short = original.toShort()
    val c: Int = original.toInt()
    val d: Long = original.toLong()
    val e: Float = original.toFloat()
    val f: Double = original.toDouble()
    val g: String = original.toString()
    println("a = $a, b = $b, c = $c, d = $d, e = $e, f = $f, g = $g")
}