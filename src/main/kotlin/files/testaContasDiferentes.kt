package files

import classes.Cliente
import classes.ContaCorrente
import classes.ContaPoupanca
import classes.Endereco

fun testaContasDiferentes() {
    val alex = Cliente("Alex", "987", 987, endereco = Endereco("Rua Uga Buga", 49,
        "Itu", "São Paulo", "SP", "01000000", "Casa 13"))
    val contaCorrente = ContaCorrente(
        titular = alex,
        numeroConta = 1000
    )
    val fran = Cliente("Fran", "123", 78)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numeroConta = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(contaPoupanca, 100.0)

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferir(contaCorrente, 100.0)

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}