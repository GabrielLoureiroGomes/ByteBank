package classes

import classes.Conta

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}