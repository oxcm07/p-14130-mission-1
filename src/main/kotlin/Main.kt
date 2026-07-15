package com

fun main() {
    println("== 명언 앱 ==")
    val wiseSayings = mutableListOf<WiseSaying>()
    var count = 0

    while (true) {
        print("명령) ")
        val input = readlnOrNull()
        if (input == "등록") {
            print("명언 : ")
            val sentence = readlnOrNull()
            print("작가 : ")
            val author = readlnOrNull()
            ++count
            wiseSayings.add(WiseSaying(count, sentence!!, author!!))
            println("${count}번 명언이 등록되었습니다.")
        }
        if (input == "목록") {
            println("번호 / 작가 / 명언")
            println("----------------------")
            wiseSayings.asReversed().forEach { saying ->
                println("${saying.id} / ${saying.author} / ${saying.sentence}")
            }
        }
        input?.let {
            if (it.startsWith("삭제?id=")) {
                val id = input.substringAfter("id=").toInt()
                wiseSayings.remove(wiseSayings.find { saying -> saying.id == id })
                println("${id}번 명언이 삭제되었습니다.")
            }
        }
        if (input == "종료") break
    }
}

data class WiseSaying(val id: Int, val sentence: String, val author: String)