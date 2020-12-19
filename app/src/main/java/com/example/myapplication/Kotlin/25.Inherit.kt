package com.example.myapplication.Kotlin

// 두번까지는 봐준다
// 두번 이상이 넘어가면 리펙토링 해라

// 25.상속
// 부모로부터 설명서를 물려받는다!

fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()
    val bus100: Bus100 = Bus100()
    bus100.drive()
}


//클래스 선언시 private 생략되어 있음
// 부모 : Car100
// 자식 : SuperCar100, Bus100
open class Car100() {
    // 기본적으로 private로 되어있다. open키워드 사용
    open fun drive(): String {
//        println("달린다 ")
        return "달린다"
    }

    open fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive(): String {
        //super 부모
//        super.drive()
//        println("빨리 달린다")
        return "빨리 달린다"
    }
}

class Bus100() : Car100() {
}