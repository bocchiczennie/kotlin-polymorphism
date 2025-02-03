package org.bocchiczennie.kotlinpolymorphism.inclusionPolymorphism

import org.springframework.stereotype.Service

@Service
class PayPayPaymentService: Payment {
    override fun pay(amount: Double): String {
        return "$amount 円支払いました"
    }
}