package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val knight = Knight(20, 4)
    val monster = Monster(15, 5)

    knight.attack(monster)
    monster.attack(knight)
//    knight.hp = 100
//    println(knight.hp)

//    monster.hp = 200
//    monster.power = 100
}

class Knight(private var hp: Int, private var power: Int) {
    open fun attack(monster: Monster) {
        monster.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("몬스터 현재 체력은 $hp 입니다.")
        } else {
            println("몬스터가 죽었습니다.")
        }
    }

    // 아무 때나 사용하는게 아니라
    // 공격을 당했을때 죽지 않았다면 힐을 한다
    private fun heal() {
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {
    open fun attack(knight: Knight) {
        knight.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("몬스터 현재 체력은 $hp 입니다.")
        } else {
            println("몬스터가 죽었습니다.")
        }

    }
}