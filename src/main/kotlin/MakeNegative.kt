class MakeNegative {

    fun makeNegative(x: Int): Int {
        return when {
          x == 0 -> 0
          x < 0 -> x
          else -> x - (2 * x)
        }
    }

}