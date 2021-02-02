import classes.Cliente
import classes.ContaCorrente
import classes.ContaPoupanca
import classes.totalContas
import files.testaContasDiferentes

fun main() {

    val gabriel = Cliente("Gabriel", "", 1)
    val contaPoupanca = ContaPoupanca(gabriel, 1000)
    val contaCorrente = ContaCorrente(gabriel, 1001)
    testaContasDiferentes()
    println("Total de contas: $totalContas")
}