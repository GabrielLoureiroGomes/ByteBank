package files

import classes.Cliente
import classes.ContaCorrente
import classes.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val gabriel = Cliente("Gabriel", "123", 123)
    val contaGabriel = ContaCorrente(gabriel, 1002)
    contaGabriel.titular = gabriel
    val jessica = Cliente("Jessica", "789", 789)
    val contaJessica = ContaPoupanca(jessica, 1003)
    contaJessica.titular = jessica
    contaGabriel.titular = gabriel

    println("Titular conta Gabriel: ${contaGabriel.titular}")
    println("Titular conta Jessica: ${contaJessica.titular}")

    println(contaGabriel)
    println(contaJessica)
}