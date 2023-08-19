class GrassHopper {
    /*
    Escreva um programa que encontre a soma de todos os números de 1 a num.
    O número será sempre um inteiro positivo maior que 0.

    Por exemplo (Entrada -> Saída) :
    2 -> 3 (1 + 2)
    8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
     */

    /* MANEIRA MAIS TRABALHOSA
    val list = listOf(1..n).flatten()
        var acumulador = 0
        for (num in list) {
            if (num != 0) {
                acumulador += num
            }
        }
        return acumulador
     */

    fun summation(n: Int): Int {
        return listOf(1..n).sumOf { it.sum() }
    }
}