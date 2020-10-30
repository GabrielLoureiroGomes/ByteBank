fun testaAutenticacao() {
    val gerente = Gerente(
        "Gabriel",
        "123",
        1000.0,
        1000
    )

    val diretora = Diretor(
        "Jessica",
        cpf = "456",
        salario = 2000.0,
        2000,
        200.0
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
}