package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    //산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    val f = 5
//    val 5 =f

    println()
    //복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    println()
    //증감 연산자
    a++
    b--
    println(a)
    println(b)

    println()
    //비교연산자
    var g = a > b
    var h = a == b
    var i = !h //정수는 뒤집을수 없다 Boolean만 가능
    var l = i != h
    println(g)
    println(h)
    println(i)
    println(l)

    println()
    //논리 연산자
    val j = h && i
    val k = h || i
    println(j)
    println(k)

}