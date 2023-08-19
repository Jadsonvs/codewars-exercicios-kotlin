import kotlin.math.exp
import kotlin.math.pow

class SomaAoQuadrado {

    fun squareSum(n: Array<Int>): Int {
        val expoente: Int = 2

       val i = n.sumOf {
           it.toDouble().pow(expoente).toInt()
       }

//        val i = n.fold(0) {
//            acc, it -> acc + it.toDouble().pow(expoente).toInt()
//        }

        return i
    }

}