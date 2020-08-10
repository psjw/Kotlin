package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    first()
    println()
    println(second(10))
    println()
    println(third(89))
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
    if(score>=80&&score<=90){
        result='A'
    }else if(score<=79&&score>=70){
        result='B'
    }else if(score<=69&&score>=60){
        result='C'
    }
    return result;
}



//3번째 문
//전달 받은 숫자의 각 자리 숫자의 합을 구하자
//조건 : 전달 받은 숫자는 무조건 두자리 숫자이다
fun third(inputNum:Int):Int{
    var result:Int=0;
    var firstNum:Int= inputNum.toString().substring(0,1).toInt()
    var secondNum:Int=inputNum.toString().substring(1,2).toInt()
    result=firstNum+secondNum;
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