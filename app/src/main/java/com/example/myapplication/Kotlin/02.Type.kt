package com.example.myapplication.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형 (참 True / 거짓 False) -> Boolean

// 변수를 선언하는 방법(1)
// Variable / Value 변수명 = 값
// var/val 변수명 = 값
var number = 10

// 변수를 선언하는 방법(2)
//var/val 변수 : 자료형 = 값
var number1: Int = 20
var hello1: String = "Hello"
var point1: Double = 3.4

// Variable or Value??
// -1. 변하지 않는 값이라면 Value
// -2. 진짜 모르겠다 Variable

fun main(args: Array<String>) {
    number = 20
    //number = 20.5 //Int에 Float을 넣으면 오류


}