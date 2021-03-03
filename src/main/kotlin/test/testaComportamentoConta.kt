package test

import exceptions.AutenticacaoException
import exceptions.SaldoInsuficienteException
import model.Cliente
import model.ContaCorrente
import model.ContaPoupanca

fun testaComportamentosConta() {

    val gabriel = Cliente(nome = "Gabriel", cpf = "", senha = 1)

    val contaGabriel = ContaCorrente(titular = gabriel, numeroConta = 1000)
    contaGabriel.deposita(200.0)

    val jessica = Cliente(nome = "Jessica", cpf = "", senha = 2)

    val contaJessica = ContaPoupanca(numeroConta = 1001, titular = jessica)
    contaJessica.deposita(300.0)

    println(contaJessica.titular)
    println(contaJessica.numero)
    println(contaJessica.saldo)

    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)

    println("depositando na conta do Gabriel")
    contaGabriel.deposita(50.0)
    println(contaGabriel.saldo)

    println("depositando na conta da Jessica")
    contaJessica.deposita(70.0)
    println(contaJessica.saldo)

    println("sacando na conta do Gabriel")
    contaGabriel.saca(250.0)
    println(contaGabriel.saldo)

    println("sacando na conta da Jessica")
    contaJessica.saca(100.0)
    println(contaJessica.saldo)

    println("saque em excesso na conta do Gabriel")
    contaGabriel.saca(100.0)
    println(contaGabriel.saldo)

    println("saque em excesso na conta da Jessica")
    contaJessica.saca(500.0)
    println(contaJessica.saldo)

    println("Transferência da conta da Jessica para o Gabriel")

    try {
        contaJessica.transfere(destino = contaGabriel, valor = 250.0, senha = 2)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: AutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaGabriel.saldo)
    println(contaJessica.saldo)
}