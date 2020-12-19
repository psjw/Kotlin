package com.example.myapplication.Kotlin

// 14. Collection
// -> list, set, map

// List
fun main(args:Array<String>){

    //Immutable Collections(변경 불가능)
    //List -> 중복을 허용한다.
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    println()
    // Set
    // -> 중복을 허용하지 않는다.
    // -> 순서가 없다!! (인덱스가 없음)
    val numberSet = setOf<Int>(3,3,3)
    println(numberSet)
    numberList.forEach{
        println(it)
    }
    println()
    // Map -> Key, Value 방식으로 관리한다.
    val numberMap =mapOf<String, Int>("one" to 1,"two" to 2)
    println(numberMap.get("one"))


    println()
    //Mutable Collection(변경가능)
    val mNumberList= mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)

    println()

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    println()

    val mNumberMap= mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("tow",2)
    println(mNumberMap)
}