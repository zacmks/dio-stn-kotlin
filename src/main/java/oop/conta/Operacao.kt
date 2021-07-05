package oop.conta

sealed class Operacao {

    class Deposito(val valor: Double) : Operacao()

    class Saque(val valor: Double) : Operacao()

    class Transferencia(val valor: Double, val contaDestino: Conta) : Operacao()

}
