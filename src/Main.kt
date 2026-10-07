import com.sun.jdi.Value

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /* # Kotlin para DAM
    Nivel de examen
    Bloque 1. Funciones
    Ejercicio 1
    Implementa una función `esPar()` que reciba un entero y devuelva `true` si el número es par.
     */
    println("<<<<< EJERCICIO 1 >>>>>>")

    fun esPar (a: Int): Boolean{
        return a % 2 == 0
    }

    val nComprobarPar = 2
    println("El número $nComprobarPar es par (${esPar(nComprobarPar)})")

    /* Ejercicio 2
    Implementa una función `mayor()` que reciba dos enteros y devuelva el mayor.
    */

    println()
    println("<<<<< EJERCICIO 2 >>>>>>")

    fun mayor (nMayor1: Int, nMayor2: Int): Int {

        if (nMayor1 > nMayor2){
        return nMayor1}
        else {
            return nMayor2
        }
    }

    val nMayor1: Int = 4
    val nMayor2: Int = 6

    println("El número mayor de $nMayor1 y $nMayor2 es: ${mayor(nMayor1, nMayor2)}")

    /* Ejercicio 3
    Implementa una función `potencia(base, exponente)` sin utilizar librerías matemáticas.
    */

    println()
    println("<<<<< EJERCICIO 3 >>>>>>")

    fun potencia (base: Int, exponente: Int): Int{
        var resultado = 1
        repeat(exponente){ // Numero de veces que se repetira la nultiplicacion
            resultado = resultado * base // la variable de resultado se va acumulando con el nº de veces del repat (4x4)x(4x4)x(4x4)
            // se podria poner resultado *= base
        }

        return resultado
    }

    val base: Int = 4
    val exponente: Int = 3

    println("$base elevado a $exponente da como resultado: ${potencia(base, exponente)}")

    /* Ejercicio 4
    Implementa una función que calcule el factorial de un número.
    */
    println()
    println("<<<<< EJERCICIO 4 >>>>>>") // Ejemplo, el factorial de 5 es 5! = 5 × 4 × 3 × 2 × 1 = 120

    fun factorial (facto: Int): Int{

        if (facto == 0) { // Ya que el factorial de 0, da siempre como resultado 1
            return 1
        }

        var calculo = facto // Varialble para ir acumulando el resultado
        var restaUno: Int = facto // Variable para ir multiplicando por el mismo numero - 1

        repeat(facto -1){ // Restamos uno al facto, para que no llegue a la vuelta 5ª, que seria resultado 0 porque se multiplicaria por 0
            restaUno -= 1 // El nº factorial le resta 1 en cada vuelta
            calculo *= restaUno //Ahora el acumulador (que comienza con el numero factorial) * el factorial - 1
        }

        return calculo
    }

    val facto: Int = 5

    println("El factorial de $facto es ${factorial(facto)}")

    /* Ejercicio 5
    Implementa una función que determine si un número es primo.
    */

    println()
    println("<<<<< EJERCICIO 5 >>>>>>")

    fun numeroPrimo (nPrimo: Int): Boolean{ // Comprobamos si al dividir el numero entre el y sus numeros restantes, el resultado es 0

        var restaUnoAPrimo: Int = nPrimo // Metemos al numero primo en una variable

       repeat(restaUnoAPrimo -2){ // repetimos la division en -2 el numero primo, ya se divide entre el siempre es 0 y si divides entre 1 tambien es 0
           restaUnoAPrimo -= 1 // Restamos uno al numero primo para que no sea ya divisible entre el, ya que daria true y sale del repeat
           if (nPrimo % restaUnoAPrimo == 0){ // Comprobamos que el resultado de la division es 0
               return false // Como no da 0 el resultado, volvemos a comprobar y dividimos por el siguiente numero (-1). Si ya no hay mas, NO ES PRIMO
           }
       }
        return true // Si no hay mas opciones y sale del repeat, si es PRIMO
    }

    val nPrimo: Int = 5

    println("El $nPrimo es un número primo: ${if (numeroPrimo(nPrimo)) "✅" else "❌"}")

    /* Bloque 2. Condicionales.
    Ejercicio 6
    Solicita una nota entre 0 y 10 y muestra:
    - Suspenso
    - Aprobado
    - Notable
    - Sobresaliente
    */

    println()
    println("<<<<< EJERCICIO 6 >>>>>>")

    println("Introduce tu nota: ESTA COMENTADO PARA QUE NO SE PIDA TODO EL RATO")
//    var nota: Int = readln().toInt()
//
//    while (nota < 0 || nota > 10) { // A diferencia del if, while comprueba la condicion hasta que se cumpla, el if, solo lo hace 1 vez
//        println("Nota incorrecta")
//        println("Introduce una nota del 0 al 10:")
//        nota = readln().toInt()
//    }
//
//    val calificacion = when {
//        nota<5 -> "Suspenso"
//        nota<6 -> "Aprobado"
//        nota<8 -> "Notable"
//        else -> "Sobresaliente"
//    }
//
//    println("Has obtenido una calificacion de $calificacion")

    /* Ejercicio 7
    Determina si un año es bisiesto.
    */

    println()
    println("<<<<< EJERCICIO 7 >>>>>>") // Años bisiestos son los que son divisibles entre 4 Y NO divisible entre 100 o SI divisible entre 400

    fun anoBisiesto(anio: Int): Boolean {
        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)
    }

    val anio: Int = 2024

    println("El año $anio es bisiesto ${if (anoBisiesto(anio)) "✅" else "❌"}")


    /* Ejercicio 8
    Dado un número, indicar si es positivo, negativo o cero.
    */

    println()
    println("<<<<< EJERCICIO 8 >>>>>>")

    var posNeg0: Int = 9

    val comprobacionPoitivo = when {
        posNeg0 < 0 -> "Negativo"
        posNeg0 == 0 -> "Cero"
        else -> "Positivo"
    }

    println("El numero $posNeg0 es $comprobacionPoitivo")


    /*Ejercicio 9
    Dados tres números, mostrar el mayor.
    */

    println()
    println("<<<<< EJERCICIO 9 >>>>>>")

    fun comprobarMayorDe3(n1: Int, n2: Int, n3: Int): Int {

        if (n1 >= n2 && n1 >= n3) {
            return n1
        }

        if (n2 >= n1 && n2 >= n3) {
            return n2
        }

        return n3
    }

    val n1esMayor: Int = 2
    val n2esMayor: Int = 4
    val n3esMayor: Int = 6

    println("El numero mayor de $n1esMayor, $n2esMayor y $n3esMayor, es el: ${comprobarMayorDe3(n1esMayor, n2esMayor, n3esMayor)}")

    /* Ejercicio 10
    Implementa una calculadora utilizando `when`.
    Operaciones:
    - +
    - -
    - *
    - /
    */

    println()
    println("<<<<< EJERCICIO 10 >>>>>>")

    val n1Cal: Double = 4.0
    val n2Cal: Double = 2.0
    val simbolo: Char = '/'

    val calculadora = when {
        simbolo == '+' -> n1Cal + n2Cal
        simbolo == '-' -> n1Cal - n2Cal
        simbolo == '*' -> n1Cal * n2Cal
        simbolo == '/' -> n1Cal / n2Cal
        else -> 0
    }

    println("$n1Cal $simbolo $n2Cal = $calculadora")


    /*  Bloque 3. Bucles
    Ejercicio 11
    Mostrar por pantalla los números del 1 al 100.
    */

    println()
    println("<<<<< EJERCICIO 11 >>>>>>")

    for (numero in 1..100){
        print("$numero · ")
    }


    /*  Ejercicio 12
    Mostrar los números pares entre 1 y 100.
    */


    println()
    println()
    println("<<<<< EJERCICIO 12 >>>>>>")

    for (numero in 1 .. 100){
        if (numero % 2 == 0){
            print(" $numero // ")
        }
    }


    /*  Ejercicio 13
    Mostrar los múltiplos de 5 entre 1 y 200.
    */

    println()
    println()
    println("<<<<< EJERCICIO 13 >>>>>>")

    for (numero in 1..200){
        if (numero % 5 == 0){
            print("$numero ·")
        }
    }

    /*  Ejercicio 14
    Calcular la suma de los números del 1 al 100.
    */

    println()
    println()
    println("<<<<< EJERCICIO 14 >>>>>>")

    var suma : Int = 0

    for (numero in 1..100){
        suma += numero
    }

    println("La suma es = $suma")


    /*  Ejercicio 15
    Mostrar la tabla de multiplicar de un número introducido por el usuario.
    */

    println()
    println("<<<<< EJERCICIO 15 >>>>>>")


    println("¿De que numero quieres sacar la tabla de multiplicar?")
    println("ESTA COMENTADO PARA QUE NO SE PIDA TODO EL RATO")
//    val nTablaMulti: Int = readln().toInt()
//
//    println("···· Tabla de multiplicar del numero $nTablaMulti ····")
//    for (numero in 1..10){
//        println("$nTablaMulti x $numero = ${nTablaMulti*numero}")
//    }


    /*  Bloque 4. Arrays
    Ejercicio 16
    Crear un array de 10 enteros e imprimir todos sus elementos.
    */

    println()
    println("<<<<< EJERCICIO 16 >>>>>>")

    val numerosArray = arrayOf(11,22,33,44,55,66,77,88,99,110)

    for (numero in numerosArray){
        println(numero)
    }


    /* Ejercicio 17
    Encontrar el elemento mayor de un array.
    */

    println()
    println("<<<<< EJERCICIO 17 >>>>>>")

    val numMayorArray = arrayOf(12,234,12,4554,654,0)

    var mayorArray = numMayorArray[0]

    for (numero in numMayorArray){
        if ( numero > mayorArray){
             mayorArray = numero
        }
    }

    println("El numero mayor del array es el $mayorArray")


    /*  Ejercicio 18
    Encontrar el elemento menor de un array.
    */

    println()
    println("<<<<< EJERCICIO 18 >>>>>>")

    val numMenorArray = arrayOf("4ola", "7letras", "3le")

    var menorArray = numMenorArray[0]

    for (numero in numMenorArray){
        if (numero.length <= menorArray.length)
            menorArray = numero
    }

    println("El elemento menor del array es el $menorArray")


    /*  Ejercicio 19
    Calcular la media de los elementos de un array.
    */
    println()
    println("<<<<< EJERCICIO 19 >>>>>>")

    val mediaArray = arrayOf(1,2,3,4,5,6)

    var acumuladorSuma: Int = 0

    for (numero in mediaArray){
        acumuladorSuma += numero
    }

    val mediaTotalArray: Double = (acumuladorSuma.toDouble() / mediaArray.size)

    println("La media de los elementos del array es $mediaTotalArray")


    /*  Ejercicio 20
    Contar cuántos números pares contiene un array.
    */


    /*  Bloque 5. Arrays avanzados
    Ejercicio 21
    Invertir un array sin utilizar `reversed()`.
    */


    /*  Ejercicio 22
    Buscar un valor dentro de un array e indicar su posición.
    */


    /*  Ejercicio 23
    Copiar un array en otro array.
    */


    /*  Ejercicio 24
    Sumar dos arrays posición a posición.
    Ejemplo:

    ```text
    [1,2,3]
    [4,5,6]

    Resultado:
    [5,7,9]
    ```
    */


    /*  Ejercicio 25
    Determinar si dos arrays contienen exactamente los mismos elementos.
    */


    /*  Bloque 6. Colecciones
    Ejercicio 26
    Crear una lista mutable de nombres.
    Añadir cinco elementos.
    */


    /*  Ejercicio 27
    Eliminar un elemento de una lista mutable.
    */


    /*  Ejercicio 28
    Mostrar todos los elementos usando `forEach`.
    */


    /*  Ejercicio 29
    Ordenar una lista alfabéticamente.
    */


    /*  Ejercicio 30
    Contar cuántos elementos contiene una lista.
    */


    /*  Bloque 7. map, filter y reduce
    Ejercicio 31
    Dada una lista de números, generar una nueva lista con los cuadrados utilizando `map`.
    */


    /*  Ejercicio 32
    Obtener únicamente los números pares utilizando `filter`.
    */


    /*  Ejercicio 33
    Obtener únicamente los mayores de 50 utilizando `filter`.
    */


    /*  Ejercicio 34
    Multiplicar todos los números por 10 utilizando `map`.
    */


    /*  Ejercicio 35
    Calcular la suma de todos los números usando `reduce`.
    */


    /*  Bloque 8. Lambdas
    Ejercicio 36
    Crear una lambda que calcule el doble de un número.
    */


    /*  Ejercicio 37
    Crear una lambda que calcule el cuadrado usando `it`.
    */


    /*  Ejercicio 38
    Crear una lambda que reciba dos parámetros y devuelva su suma.
    */


    /*  Ejercicio 39
    Crear una lambda que determine si un número es positivo.
    */


    /*  Ejercicio 40
    Crear una lambda que reciba una cadena y devuelva su longitud.
    */


    /*  Bloque 9. Funciones de orden superior
    Ejercicio 41
    Crear una función que reciba otra función para realizar una operación matemática.
    */


    /*  Ejercicio 42
    Utilizar la función anterior para realizar una suma.
     */



    /*  Ejercicio 43
    Utilizar la función anterior para realizar una multiplicación.
    */


    /*  Bloque 10. Vararg
    Ejercicio 44
    Crear una función que sume un número variable de enteros.
    */


    /* Ejercicio 45
    Crear una función que devuelva el mayor utilizando `vararg`.
    */


    /*  Bloque 11. Funciones de extensión
    Ejercicio 46
    Crear una función de extensión para `String` llamada `invertir()`.
    */


    /*  Ejercicio 47
    Crear una función de extensión para `Int` llamada `esPar()`.
    */


    /*  Ejercicio 48
    Crear una función de extensión para `List<Int>` que devuelva la suma de todos sus elementos.
    */


    /*  Bloque 12. Null Safety
    Ejercicio 49
    Crear una función que reciba un `String?` y devuelva su longitud. Si es nulo devolverá 0.
    */


    /*  Ejercicio 50
    Dada la siguiente lista:
    ```kotlin
    val nombres = listOf(
        "Ana",
        null,
        "Pedro",
        null,
        "Lucía"
    )
    ```
    Mostrar únicamente los nombres no nulos.
    */


    /* Ejercicio Final
    Desarrolla una aplicación de gestión de alumnos que:

    1. Cree una data class Alumno.
    2. Permita almacenar alumnos en una MutableList.
    3. Añada alumnos mediante funciones.
    4. Calcule la nota media.
    5. Obtenga los aprobados usando filter.
    6. Obtenga los nombres usando map.
    7. Ordene los alumnos por nota.
    8. Utilice al menos una función de extensión.
    9. Utilice una función con vararg.
    10. Utilice Null Safety.
    11. Muestre toda la información por pantalla utilizando forEach.
 */













}