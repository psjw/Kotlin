package com.example.myapplication.Kotlin

import java.time.temporal.TemporalAmount
import kotlin.math.acos

fun main(array: Array<String>) {
    val operation1 = Operation(3, 2, "+")
    val operation2 = Operation(3, 2, "/")
    val operation3 = Operation(3, 2, "*")
    val operation4 = Operation(3, 2, "-")
    val calculator1 = Calculator1()
    println(calculator1.plus(4, 5))
    println(calculator1.minus(4, 5))
    println(calculator1.mutiply(4, 5))
    println(calculator1.divide(4, 5))

    //calculator1.plus(3,4).divide(4, 5)
    //-----------/ Calculator1
    //---------------------/ 7
    //----------------------------------/ 7.divide(4,5)
    println()
    val caculator2 = Caculator2()
    println(caculator2.plus(1,2,3,4,5))
    println(caculator2.minus(10,1,2,3))
    println(caculator2.multiply(1,2,3))
    println(caculator2.divide(10,2,3))
    println()
    val calculator3=Calculator3(3)
    calculator3.plus(5).minus(3)
    //---------/ -> Calculator3(3)
    //-------------------------/ -> Calculator3(8)
    //------------------------------------------/Calculator3(8).minus(5)
    // -> Chaining(체이닝)


    println()
    val tvClass = TvClass()
    println(tvClass.currentTvStatus())
    tvClass.channelChange("")
    println(tvClass.currentChannel())
    tvClass.channelChange("")
    println(tvClass.currentChannel())
    tvClass.channelChange("K")
    println(tvClass.currentChannel())
}

// 1) 사칙연산을 수행할 수 있는 클래스
class Operation(var a: Int, var b: Int) {
    var operator: String = ""

    constructor(a: Int, b: Int, operator: String) : this(a, b) {
        println(this.operator)
        when (operator) {
            "+" -> {
                plus()
            }
            "-" -> {
                mius()
            }
            "/" -> {
                divide()
            }
            "*" -> {
                multi()
            }
        }
    }


    fun plus() {
        println("$a + $b = ${a + b}")
    }

    fun mius() {
        println("$a - $b = ${a - b}")
    }

    fun multi() {
        println("$a * $b = ${a * b}")
    }

    fun divide() {
        println("$a / $b = ${a / b}")
    }
}

class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다.
        return a - b
    }

    fun mutiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        //먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        // 리턴은 몫만 한다.
        return a / b
    }
}

class Caculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        //10 - 1 -2 -3
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if(i!=0)
                result -= numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if(it!=0){
                result=result*it
            }
        }
        return result
    }

    fun divide(vararg numbers:Int):Int{ // 10, 2, 3 -> 10/2/3
        var result :Int = numbers[0]
        numbers.forEachIndexed{index:Int,value:Int ->
            //10이 아닌 3이 와야됨
            //10 -> 10/10/2/3
            if(index!=0){
                if(value!=0){
                    result=result/value
                }
            }
        }
        return result
    }

}

class Calculator3(val initialValue:Int){
    fun plus(number:Int):Calculator3{
        val result = this.initialValue+number
        return Calculator3(result)
    }

    fun minus(number:Int):Calculator3{
        val result= this.initialValue-number
        return Calculator3(result)
    }
    fun multiply(number:Int):Calculator3{
        val result=this.initialValue*number
        return Calculator3(result)
    }

    fun divide(number:Int):Calculator3{
        val result=this.initialValue/number
        return Calculator3(result)
    }


}

