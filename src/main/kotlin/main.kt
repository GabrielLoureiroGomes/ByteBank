import model.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Jorge Pilli Netto")
    enderecoNulo?.let { rua ->
        println(rua.logradouro)
        println(rua.logradouro.length)
    }
}

