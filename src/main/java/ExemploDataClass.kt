

data class Produto(val cod: Int, var name: String, var preco: Double)





fun main() {
    // Construtor
    val produto = Produto(1, "Computador", 10.0)
    val produtoJ = ProdutoJ(1, "Computador", 10.0)

    // Getters


    println(Produto(1, "Computador", 10.0))
    println(ProdutoJ(1, "Computador", 10.0))



}
