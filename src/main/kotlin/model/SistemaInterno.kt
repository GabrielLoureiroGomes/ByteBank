package model

import model.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem-vindo ao Byte Bank!")
        } else {
            println("Falha na autenticação!")
        }
    }
}