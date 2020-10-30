fun testaFuncionarios() {
    val gabriel = Analista(
        nome = "Gabriel",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${gabriel.nome}")
    println("cpf ${gabriel.cpf}")
    println("salario ${gabriel.salario}")
    println("bonificação ${gabriel.bonificacao}")

    val jessica = Gerente(
        nome = "Jessica",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${jessica.nome}")
    println("cpf ${jessica.cpf}")
    println("salario ${jessica.salario}")
    println("bonificação ${jessica.bonificacao}")

    if (jessica.autentica(1234)) {
        println("Logado com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val fred = Diretor(
        nome = "Fred",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${fred.nome}")
    println("cpf ${fred.cpf}")
    println("salario ${fred.salario}")
    println("bonificação ${fred.bonificacao}")
    println("plr ${fred.plr}")

    if (fred.autentica(4000)) {
        println("Logado com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val graciete = Analista(
        nome = "graciete",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registrar(gabriel)
    calculadora.registrar(jessica)
    calculadora.registrar(fred)
    calculadora.registrar(graciete)

    println("total de bonificação: ${calculadora.total}")
}