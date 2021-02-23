package files

import exceptions.AutenticacaoException
import exceptions.SaldoInsuficienteException
import model.Cliente
import model.ContaCorrente
import model.ContaPoupanca

fun testaComportamentosConta() {

    val gabriel = Cliente("Gabriel", "123456789", 123)
    val contaGabriel = ContaCorrente(gabriel, 1000)
    contaGabriel.depositar(200.0)

    val jessica = Cliente("Jessica", "987654321", 456)
    val contaJessica = ContaPoupanca(numeroConta = 1001, titular = jessica)
    contaJessica.depositar(300.0)

    println(contaJessica.titular)
    println(contaJessica.numeroConta)
    println(contaJessica.saldo)

    println(contaGabriel.titular)
    println(contaGabriel.numeroConta)
    println(contaGabriel.saldo)

    println("Depositando na conta do Gabriel")
    contaGabriel.depositar(50.0)
    println(contaGabriel.saldo)

    println("Depositando na conta da Jessica")
    contaJessica.depositar(70.0)
    println(contaJessica.saldo)

    println("Sacando da conta do Gabriel")
    contaGabriel.sacar(250.0)
    println(contaGabriel.saldo)

    println("Sacando da conta da Jessica")
    contaJessica.sacar(100.0)
    println(contaJessica.saldo)

    println("Saque em excesso na conta do Gabriel")
    contaGabriel.sacar(100.0)
    println(contaGabriel.saldo)

    println("Saque em excesso na conta da Jessica")
    contaJessica.sacar(500.0)
    println(contaJessica.saldo)

    println("Transferência da conta da Jessica para o Gabriel")

    try {
        contaJessica.transferir(contaGabriel, 250.0, 456)
        println("Transferência feita com sucesso!")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        e.printStackTrace()
    } catch (e: AutenticacaoException) {
        println("Falha na autenticação!")
        e.printStackTrace()
    }

    println(contaGabriel.saldo)
    println(contaJessica.saldo)
}