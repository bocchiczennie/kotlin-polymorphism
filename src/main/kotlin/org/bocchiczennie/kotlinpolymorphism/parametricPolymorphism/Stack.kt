/**
 * パラメトリック多相
 * 型パラメータを利用して、異なる型のオブジェクトを扱うことができる
 * ここでは Stack クラスが任意の型 T に対応できる
 * */

package org.bocchiczennie.kotlinpolymorphism.parametricPolymorphism

class Stack<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T? {
        if (elements.isEmpty()) return null
        return elements.removeAt(elements.size - 1)
    }
}


fun main() {
    val integerStack = Stack<Int>()
    integerStack.push(1)
    integerStack.push(2)

    println(integerStack.pop()) // 2
    println(integerStack.pop()) // 1
    println(integerStack.pop()) // null
}
