package com.example.myapplication.Kotlin


//28.인터페이스
// - 인터페이스도 구현이 있는 함수를 만들수 있다.
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
// - 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 반드시 구현해야 한다
fun main(args: Array<String>) {
    val student2: Student2 = Student2()
    student2.sleep()
}

interface Person2 {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    //반드시 구현해야한다.
    abstract fun study()
}

class Student2() : Person2 {
    override fun study() {
    }
}


class Teacher2() : Person2 {
    override fun study() {
    }
}