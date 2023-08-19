class RemoveFirstandLastCharacter {

    fun removeChar(str: String): String {
       return str.substring(startIndex = 1, endIndex = str.length - 1)
//        str.drop()
    }

}