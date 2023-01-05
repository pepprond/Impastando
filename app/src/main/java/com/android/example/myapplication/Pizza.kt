package com.android.example.myapplication

open class Pizza (open val totale: Double, open val Lievito: String) {
    init {
        println("totale kg pizza: $totale")
        fun perch() {
            if (Lievito=="normale") {
                val Farina = totale * 56.37 / 100
                val Acqua = totale * 42.28 / 100
                val Lievito = totale * 1.13 / 100
                val Sale = totale * 0.22 / 100
                println("percentuali impasto:\nfarina(56,37%) grammi:$Farina \nacqua(42,28%) grammi:$Acqua \nlievito(1,13%) grammi:$Lievito \nsale(0,22%) grammi:$Sale")
            } else if (Lievito == "madre") {
                val Farina = totale * 54.30 / 100
                val Acqua = totale * 40.72 / 100
                val Lievito = totale * 4.75 / 100
                val Sale = totale * 0.22 / 100
                println("percentuali impasto:\nfarina(54.30%) grammi:$Farina \nacqua(40.72%) grammi:$Acqua \nlievito madre(4.75%) grammi:$Lievito \nsale(0,22%) grammi:$Sale")
            }

        }
        println(perch())
    }
}