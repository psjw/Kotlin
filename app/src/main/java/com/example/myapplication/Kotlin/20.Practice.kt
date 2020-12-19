package com.example.myapplication.Kotlin


fun main(array: Array<String>) {

    val account1 = Account("ljw", "20201215", 10)
    account1.cashIn(5)
    println(account1.cashInfo())
    account1.cashOut(1)
    println(account1.cashInfo())
    println()
    val account2: Account2 = Account2("홍길동", "1990/3/1", 1000)
    println(account2.checkBalance())
    println(account2.save(1000))
    println(account2.withdraw(2000))
    println(account2.checkBalance())
    println()
    val account3: Account3 = Account3("홍길동", "1990/3/1")
    println(account3.checkBalance())
    val account4: Account3 = Account3("홍길동", "1990/3/1",4000)
    println(account4.checkBalance())
    println()

}


// 2) 은행계좌 만들기
// - 계좌 생성 기능 (이름, 생년 월일)
// - 잔고를 확인하는 기능
// - 출금 기능
// - 예금 기능
class Account(name: String, birthDay: String) {
    var amount: Int = 0;

    constructor(name: String, birthDay: String, amount: Int) : this(name, birthDay) {
        this.amount = amount
    }

    fun cashIn(money: Int) {
        amount += money
    }

    fun cashOut(money: Int): Int {
        amount -= money
        return amount
    }

    fun cashInfo(): Int {
        return amount
    }
}

class Account2 {
    val name: String
    val birth: String
    var balance: Int = 0

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(val name: String, val birth: String, var balance: Int = 1000) {
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }

}

//initialBalance var/val없으면 클래스내 함수에서 접근 불가
class Account4(initialBalance :Int){
    val balance:Int = if(initialBalance>=0)initialBalance else 0
    fun checkBalance():Int{
        return balance
    }
}
