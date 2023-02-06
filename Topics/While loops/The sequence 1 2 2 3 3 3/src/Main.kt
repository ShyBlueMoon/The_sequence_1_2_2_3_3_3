fun main() {
    // put your code here

    val numeroEntrada: Int = readln().toInt()
    sequenciaNumeros(numeroEntrada)



}

fun sequenciaNumeros(numeroEntrada:Int) {


    var listaApresentada = 0
    var contador = 0
    while (contador <= numeroEntrada) {
        repeat(listaApresentada) {
            if (contador < numeroEntrada) {
                print("$listaApresentada ")
                contador++
            } else {
                return
            }

        }
        listaApresentada++
    }


}