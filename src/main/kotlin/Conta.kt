open class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun sacar(valor: Double) {
        if (valor >= 0) {
            saldo -= valor
        }
    }

    fun transferir(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }
}