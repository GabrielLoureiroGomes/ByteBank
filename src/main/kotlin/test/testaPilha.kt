package test

import exceptions.SaldoInsuficienteException

fun testaPilha() {
    println("Inicio main")
    funcao1()
    println("Fim main")
}

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("Fim funcao2")
}