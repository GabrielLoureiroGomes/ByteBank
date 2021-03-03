package test

import model.*

fun testaObjects() {
    val jessica = object : Autenticavel {
        val nome: String = "Jessica"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(jessica, 1000)
    println("nome do cliente ${jessica.nome}")

    val gabriel = Cliente(nome = "Gabriel", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = gabriel, numeroConta = 1000)
    val contaCorrente = ContaCorrente(titular = gabriel, numeroConta = 1001)

    println("Total de contas: ${Conta.total}")
}