class Alumno {


    /* Ejercicio Final
   Desarrolla una aplicación de gestión de alumnos que:

   1. Cree una data class Alumno.
   2. Permita almacenar alumnos en una MutableList.
   3. Añada alumnos mediante funciones.
   4. Calcule la nota media.
   5. Obtenga los aprobados usando filter.
   /TODO 6. Obtenga los nombres usando map.
   /TODO 7. Ordene los alumnos por nota.
   /TODO 8. Utilice al menos una función de extensión.
   /TODO 9. Utilice una función con vararg.
   /TODO 10. Utilice Null Safety.
   /TODO 11. Muestre toda la información por pantalla utilizando forEach.
*/

    val alumnos = mutableListOf<Alumno>()

    data class Alumno ( // data class: Kotlin proporciona automáticamente funciones útiles, como toString(), equals() y copy().
        val nombreAlumno: String,
        val nota: Double
    )


    fun anadirAlumno(nombre: String, nota: Double){
        alumnos.add(Alumno(nombre, nota))
    }

    fun calcularMedia(): Double {
        if (alumnos.isEmpty()) { // isEmpty() comprueba si una colección está vacía.
            println("No hay alumnos")
            return 0.0 // return 0.0 termina la función inmediatamente.
        }

        var sumaNotas = 0.0

        for (element in alumnos) {
            sumaNotas += element.nota // sumaNotas += element.nota acumula las notas.
        }

        return sumaNotas / alumnos.size // sumaNotas / alumnos.size calcula la media.
    }

    val aprobados = alumnos.filter { alumno -> alumno.nota >= 5.0 }

    val nombresAlumnos: List<String> = alumnos.map { it.nombreAlumno }

    fun ordenAlumnosPorNota(): List






}