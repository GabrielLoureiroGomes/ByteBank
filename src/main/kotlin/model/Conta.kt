package model

import exceptions.AutenticacaoException
import exceptions.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta!")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(contaDestino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) throw SaldoInsuficienteException("O saldo é insuficiente! Saldo atual: $saldo")

        if (!autentica(senha)) {
            throw AutenticacaoException()
        }

        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
        }
    }
}