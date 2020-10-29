fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaGabriel = Conta("Gabriel", 1002)
    contaGabriel.titular = "Gabriel"
    var contaJessica = Conta("Jessica", 1003)
    contaJessica.titular = "Jessica"
    contaGabriel.titular = "Gabriel"

    println("Titular conta Gabriel: ${contaGabriel.titular}")
    println("Titular conta Jessica: ${contaJessica.titular}")

    println(contaGabriel)
    println(contaJessica)
}