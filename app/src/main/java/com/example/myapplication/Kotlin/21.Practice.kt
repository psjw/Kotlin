package com.example.myapplication.Kotlin


fun main(array: Array<String>) {
    val tvClass = TvClass()
    println(tvClass.currentTvStatus())
    tvClass.channelChange("")
    println(tvClass.currentChannel())
    tvClass.channelChange("")
    println(tvClass.currentChannel())
    tvClass.channelChange("K")
    println(tvClass.currentChannel())
    println()

    val tv = TV(listOf<String>("K", "M", "S"))
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.currentChannelNumber
}


// 3) TV 클래스
// - on / off 기능
// - 채널을 돌리는 기능
// - 초기 채널은 (S사 M사 K사 3개)

class TvClass {
    var onOff: String = "off"
    var channel: Int = 0
    var channelList = mutableListOf<String>("S", "K", "M")
    fun onOffTv(action: String) {
        when (action) {
            "on" -> {
                onOff = "on"
            }
            "off" -> {
                onOff = "off"
            }
        }
    }

    fun currentTvStatus(): String {
        return onOff;
    }

    fun channelChange(cChannel: String) {
        if ("".equals(cChannel)) {
            channel += 1
            if (channel > channelList.size) {
                channel = 0
            }
        } else {
            channelList.forEachIndexed { index: Int, ch: String ->
                if (cChannel.equals(channelList.get(index))) {
                    channel = index
                }
            }
        }
    }

    fun currentChannel(): String {
        return channelList[channel]
    }


}


class TV(var channels: List<String>) {
    var onOrOff: Boolean = false // True -> On, False -> Off
    // 변수 바로 아래 써줘야함
    // set 함수 안에서 currentChannelNumber의 Value의 변화를 알수 있음
    // currentChannelNumber에 할당할 때 사용
    var currentChannelNumber = 0
        set(value) {
            field=value //field 키워드로 무한루프 회피
            //currentChannelNumber=value //무한루프에 빠진다 -> 계속 set함수에서 currentChannelNumber에 할당할때마다 호출된다.
            if(field>2){
                field=0
            }
            if(field<0){
                field=2
            }

        }
        // 호출이 될 경우에는 get으로 호출됨
        get() {
            println("호출되었습니다.")
            return field
        }

    fun switch() {
        onOrOff != onOrOff
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
//        channels.forEachIndexed { index: Int, value: String ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber = currentChannelNumber + 1
//                return
//            }
//        }
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelDown() {
        currentChannelNumber = currentChannelNumber - 1
//        channels.forEachIndexed { index: Int, value: String ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber = currentChannelNumber - 1
//                return
//            }
//        }
    }
}