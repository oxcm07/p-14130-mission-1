package com

fun main() {
    println("== 명언 앱 ==")

    while (true) {
        print("명령) ")
        val input = readLine()
        if (input == "등록"){
            print("명언 : ")
            val sentence = readLine()
            print("작가 : ")
            val author = readLine()
        }
        if (input == "종료") break
    }
}