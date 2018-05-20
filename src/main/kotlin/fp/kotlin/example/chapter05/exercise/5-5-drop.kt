package fp.kotlin.example.chapter05.exercise

import fp.kotlin.example.chapter05.FunList
import fp.kotlin.example.chapter05.FunList.Cons
import fp.kotlin.example.chapter05.FunList.Nil
import fp.kotlin.example.chapter05.funListOf

/**
 *
 * 연습문제 5-5
 *
 * 리스트에서 앞의 n개의 값을 제외한 리스트를 반환는 drop 함수를 구현하자. 이때 원본 리스트가 바뀌지 않고, 새로운 리스트를 반환할때 리스트를 매번
 * 생성하지않고, 한번만 생성해야 한다.
 *
 * 힌트: 함수의 선언 타입은 아래와 같다.
 *
 */

fun main(args: Array<String>) {

    val intList = Cons(1, Cons(2, Cons(3, Nil)))
    require(intList.drop(1) == funListOf(2, 3))
}

fun <T> FunList<T>.drop(n: Int): FunList<T> = TODO()