package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if(a == null){
        println("a is null")
    }else{
        println("a is not null")
    }

    if(b+c==110){
        println("b plus c eqaul 110")
    }else{
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number : Int? =null
    val number2 = number ?: 10 //number가 null이면 10이 들어감
    println()
    println(number2)

    //값을 리턴하는 if 사용법 ->반드시 else가 있어야 됨(리턴을 반드시 해줘야하므로)
    val num1:Int =10
    val num2:Int =20
    val max = if(num1>num2){
        num1//5
    }else if(num1==num2){
        num2//10
    }else{
        100
    }


}