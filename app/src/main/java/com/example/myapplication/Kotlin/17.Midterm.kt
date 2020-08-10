package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    first()
    println()
    println(second(10))
    println()
    println(third(89))
    println()
    gugudan()
}

//1번문제
//List를 두개 만든다
//첫번째 List에는 1부터 9까지 값을 넣는다(반복문 사용)
//두번째 List에는 첫번째 List의 값을 하나씩 확인한 후
//짝수면 True 홀수면 False를 넣어준다
fun first(){
    val firstNumberList = MutableList(9,{0})
    var secondBoolList = MutableList(9,{false})



    for(i in 0 until  firstNumberList.size){
        firstNumberList.set(i,i+1);
        if(firstNumberList.get(i)%2==0)
            secondBoolList.set(i,true)
        else
            secondBoolList.set(i,false)
    }

    println(firstNumberList)
    println(secondBoolList)
}

//2번 문제
//학점을 구하자
//80 - 90 -> A
//70 - 79 -> B
//60 - 69 -> C
//나머지 F
fun second(score:Int):Char{
    var result:Char='F'
    when(score){
        in 90..100 ->{
            result='A'
        }
        in 80..89 ->{
            result='B'
        }
        in 70..79->{
            result='C'
        }
        else ->{
            result='F'
        }
    }
    return result
}



//3번째 문
//전달 받은 숫자의 각 자리 숫자의 합을 구하자
//조건 : 전달 받은 숫자는 무조건 두자리 숫자이다
fun third(inputNum:Int):Int{
    val a:Int=inputNum/10
    val b:Int=inputNum%10
    var result:Int=a+b;
//    var firstNum:Int= inputNum.toString().substring(0,1).toInt()
//    var secondNum:Int=inputNum.toString().substring(1,2).toInt()
//    result=firstNum+secondNum;
    return result;
}


//4번 문제
//구구단을 출력하자

fun gugudan(){
    for(i in 0 until 10){
        for(j in 1 until 10){
            println(i.toString()+" X "+j.toString()+"="+(i*j).toString())
        }
    }
}