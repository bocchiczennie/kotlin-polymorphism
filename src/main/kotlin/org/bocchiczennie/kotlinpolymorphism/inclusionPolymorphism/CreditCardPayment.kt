/**
 * CreditCardPaymentService は Payment インターフェースを実装し、具体的なクレジットカードでの支払い処理を実装する
 * スーパータイプである Payment インターフェースは、pay メソッドから異なる中身を呼び出すことができる
 * */

package org.bocchiczennie.kotlinpolymorphism.inclusionPolymorphism

class CreditCardPayment: Payment {
    override fun pay(amount: Double): String {
        return "$amount 円支払いました"
    }
}

fun main() {
    val creditCardPayment = CreditCardPayment()
    println(creditCardPayment.pay(1000.0))
}