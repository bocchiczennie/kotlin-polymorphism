/**
 * アドホック多相
 * 同じ関数名や演算子が異なる型に対して異なる実装を持ち、特定の型ごとに異なる動作を提供する
 * ここでは Calculator クラスを定義し、add 関数をオーバーロードしている
 * */

package org.bocchiczennie.kotlinpolymorphism.adhocPolymorphism

class Calculator {
    fun add(a: Double): Double {
        return a + 10
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {
    val calculator = Calculator()
    println(calculator.add(10.0))
    println(calculator.add(10.0, 20.0))
}