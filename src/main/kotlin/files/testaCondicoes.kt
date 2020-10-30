package files

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo da conta é positiva")
    } else if (saldo == 0.0) {
        println("Saldo da conta é neutra")
    } else {
        println("Saldo da conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Saldo da conta é positiva")
        saldo == 0.0 -> println("Saldo da conta é neutra")
        else -> println("Saldo da conta é negativa")
    }
}