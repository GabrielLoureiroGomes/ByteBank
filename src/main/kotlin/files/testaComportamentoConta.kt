package files

import classes.ContaCorrente
import classes.ContaPoupanca

fun testaComportamentosConta() {
    val contaGabriel = ContaCorrente("Gabriel", 1000)
    contaGabriel.depositar(200.0)

    val contaJessica = ContaPoupanca(numeroConta = 1001, titular = "Jessica")
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

    if (contaJessica.transferir(contaGabriel, 300.0)) {
        println("Transferência feita com sucesso!")
    } else {
        println("Falha na transferência")
    }

    println(contaGabriel.saldo)
    println(contaJessica.saldo)
}