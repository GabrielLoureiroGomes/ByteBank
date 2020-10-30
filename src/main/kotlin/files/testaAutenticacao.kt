package files

import classes.Cliente
import classes.Diretor
import classes.Gerente
import classes.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        "Gabriel",
        "123",
        1000.0,
        1000
    )

    val diretora = Diretor(
        "Jessica",
        "456",
        2000.0,
        2000,
        200.0
    )

    val cliente = Cliente(
        "Fred",
        "789",
        3000
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 3000)
}