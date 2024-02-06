package org.billy

fun main() {
//    println("Hello Kotlin");
//    Human().hello()
//    Kotlin沒有基本資料型態
    val h  = Human()
    h.hello()
    val age : Int = 19
    val age2 = 20
    var weight = 66.5
    var weight2 = 66.5f
    var name : String
    name = "Hank"


}

//val(value)代表當我定義完這個物件後就不能再修改他的值了，不可變的
//var(varible)值可以改變的
//vak 名稱: 型態=值

class Human{
    fun hello() {
        println("Hello Kotlin")
    }
}

