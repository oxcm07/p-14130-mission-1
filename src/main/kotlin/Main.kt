package com

fun main() {
    println("== 명언 앱 ==")
    var sentences = mutableListOf<String>()
    var authors = mutableListOf<String>()

    while (true) {
        print("명령) ")
        val input = readlnOrNull()
        if (input == "등록") {
            print("명언 : ")
            val sentence = readlnOrNull()
            sentence?.let { sentences.add(it) }
            print("작가 : ")
            val author = readlnOrNull()
            author?.let { authors.add(it) }
            println("${sentences.size}번 명언이 등록되었습니다.")
        }
        if (input == "목록") {
            println("번호 / 작가 / 명언")
            println("----------------------")
            sentences.indices.reversed().forEach { index ->
                println("${index + 1} / ${authors[index]} / ${sentences[index]}")
            }
        }
        if (input == "종료") break
    }
}