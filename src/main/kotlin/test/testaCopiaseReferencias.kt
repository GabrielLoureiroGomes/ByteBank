package test

import model.Cliente
import model.ContaCorrente
import model.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val gabriel = Cliente(nome = "Gabriel", cpf = "", senha = 1)

    val contaGabriel = ContaCorrente(gabriel, 1002)
    contaGabriel.titular.nome = "Gabriel"
    val contaJessica = ContaPoupanca(
        Cliente(
            nome = "Jessica",
            cpf = "",
            senha = 2
        ), 1003
    )
    contaJessica.titular.nome = "Jessica"
    contaGabriel.titular.nome = "Gabriel"

    println("titular conta Gabriel: ${contaGabriel.titular}")
    println("titular conta Jessica: ${contaJessica.titular}")

    println(contaGabriel)
    println(contaJessica)
}