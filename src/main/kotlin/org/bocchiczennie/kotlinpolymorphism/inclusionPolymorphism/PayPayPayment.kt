package org.bocchiczennie.kotlinpolymorphism.inclusionPolymorphism

class PayPayPayment: Payment {
    override fun pay(amount: Double): String {
        return "$amount 円支払いました"
    }
}

fun main() {
    val payPayPayment = PayPayPayment()
    println(payPayPayment.pay(1000.0))
}