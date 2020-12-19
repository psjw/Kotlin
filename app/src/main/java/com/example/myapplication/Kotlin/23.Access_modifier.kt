package com.example.myapplication.Kotlin

// 23. 접근제어자

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")
    // Private 라는 키워드 때문에 외부에서 더이상 사용할 수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name="아무개 투"
//    println(testAccess.name)
    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
//    runningCar.run()
}

class Reward() {
    var rewardAmount: Int = 1000

}

class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    private fun test() {
        println("테스트")
    }

    fun changeName(newName: String) {
        this.name = newName
    }
}

class RunningCar() {
    fun runFast() {
        run()
    }

    private fun run() {

    }
}