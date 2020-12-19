package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    first()
    println(second(80))
    println(third(89))
    gugudan()
}


// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0부터 9까지 값을 넣는다(반복문사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False를 넣어준다.
fun first(): Unit {
//    var a = mutableListOf<Int>()
//    var b = mutableListOf<Boolean>()
    var a = MutableList(9, { 0 })
    var b = MutableList(9, { true })
    for (i in 0 until (10)) {
        a.add(i)
    }

    a.forEachIndexed { index: Int, item: Int ->
        if (a[index] % 2 == 0) {
            //짝수
            b.add(true)
        } else {
            //홀수
            b.add(false)
        }
    }
    println(a)
    println(b)
}


// 2번 문제
// 학점을 구하자
// 90 - 100 -> A
// 70 - 89 -> B
// 60 - 69 -> C
// 나머지 F
fun second(score: Int): String {
//    var resultGrade = "F"
//    if (score >= 90 && score <=100) {
//        resultGrade="A"
//    }else if(score>=80&&score<90){
//        resultGrade="B"
//    }else if(score>=60&&score<70){
//        resultGrade="C"
//    }else{
//        resultGrade="F"
//    }
//    return resultGrade
    when (score) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
        }
    }
}


// 3번 문제
// 전달 받은 숫자의 각 자라 숫자의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다.
fun third(number: Int): Int {
    //89 -> 8 + 9
    var firstNum = number / 10
    var secnodNum = number % 10
    return firstNum + secnodNum
}

// 4번 문제
// 구구단을 출력하자
fun gugudan() {
    for (i in 1 until 10) {
        // 1 -> 2
        for (j in 1 until 10) {
            println("$i X $j = ${i*j}")
            // 1부터 9까지 반복 -> 1부터 9까지 반복 -> ..
        }
    }
}