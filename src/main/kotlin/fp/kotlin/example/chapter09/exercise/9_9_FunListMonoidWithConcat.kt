package fp.kotlin.example.chapter09.exercise

import fp.kotlin.example.chapter05.concat
import fp.kotlin.example.chapter05.funListOf

/**
 * 연습문제 9-9
 *
 * FunList 모노이드의 ``mconcat`` 함수를 ``[[1, 2], [3, 4], [5]]``와 같은 중첩 리스트를 넣어서 테스트해보자. 테스트 결과를 확인하고, 동작 원리를 생각해보자.
 *
 */

fun main(args: Array<String>) {

    val list1 = funListOf(funListOf(1, 2), funListOf(3, 4))
    val list2 = funListOf(funListOf(5, 6), funListOf(7, 8))

    require(list1.concat(list2) == funListOf(funListOf(1, 2), funListOf(3, 4), funListOf(5, 6), funListOf(7, 8)))
}