package com.survivalcoding

import java.time.LocalDateTime

class YukymController(
    private val now: LocalDateTime = LocalDateTime.now()
) {
    fun getTyA(): String = when (now.monthValue) {
        1, 2 -> "경오1국"
        3, 4 -> "경오2국"
        5, 6 -> "경오3국"
        7, 8 -> "경오4국"
        9, 10 -> "경오5국"
        11, 12 -> "경오6국"
        else -> TY1
    }

    fun getTyB(): String = when (now.hour) {
        in 0..<2 ->  TY1
        in 4..<6 ->  TY2
        in 6..<8 ->  TY3
        in 8..<10 ->  TY4
        in 10..<12 ->  TY5
        in 12..<14 ->  TY6
        in 16..<18 ->  TY7
        in 18..<20 ->  TY8
        in 20..<22 ->  TY9
        in 22..<24 ->  TY10
        else -> TY12
    }

    companion object {
        const val TY1: String = "갑자1국"
        const val TY2: String = "갑자2국"
        const val TY3: String = "갑자3국"
        const val TY4: String = "갑자4국"
        const val TY5: String = "갑자5국"
        const val TY6: String = "갑자6국"
        const val TY7: String = "갑자7국"
        const val TY8: String = "갑자8국"
        const val TY9: String = "갑자9국"
        const val TY10: String = "갑자10국"
        const val TY11: String = "갑자11국"
        const val TY12: String = "갑자12국"
    }
}
