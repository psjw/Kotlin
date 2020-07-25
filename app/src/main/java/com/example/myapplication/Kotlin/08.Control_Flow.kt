package com.example.myapplication.Kotlin

// 08. 제어흐름
// - if, else


fun main(array: Array<String>) {

    val a: Int = 5
    val b: Int = 10
    // if/else 사용방법 (1)
    if (a > 5) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    // if/else 사용방법 (2)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else if (a == b) {
        println("a와 b는 같다")
    } else {

    }

    //값을 리턴하는 if 사용방법(1)
    // 반드시 값을 리턴해야됨
    var max = if(a>b){
        a //5
    }else{
        b //10
    }
    //값을 리턴하는 if 사용방법(2)
    var max1 = if(a>b) a else b

    println()
    println(max)

}