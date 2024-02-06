package org.billy

fun main() {
//    println("Hello Kotlin");
//    Human().hello()
    val h  = Human()
    h.hello()
}

//val(value)代表當我定義完這個物件後就不能再修改他的值了


class Human{
    fun hello() {
        println("Hello Kotlin")
    }
}

