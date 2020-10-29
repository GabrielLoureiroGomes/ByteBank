class ContaCorrente(
    titular: String,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.sacar(valorComTaxa)
    }
}