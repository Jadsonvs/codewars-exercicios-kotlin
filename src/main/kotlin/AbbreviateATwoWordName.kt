class AbbreviateATwoWordName {
    /*
        Escreva uma função para converter um nome em iniciais.
        Este kata leva estritamente duas palavras com um espaço entre elas.

        A saída deve ser duas letras maiúsculas com um ponto separando-as.

        Deve ficar assim:
        Sam Harris => S.H
        patrick feeney => P.F
     */

    fun abbrevName(name:String) = name.split(" ")
        .joinToString(".") { it.first().toString().uppercase() }



}


//fun abbrevName(name:String) = name.split(" ").map { it.get(0) }.joinToString(".")