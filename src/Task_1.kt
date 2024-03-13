import java.util.Scanner
import kotlin.math.PI

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введіть радіус кулі: ")
    val radius = scanner.nextFloat()

    if (radius < 0) {
        println("Некоректний ввід даних. Радіус не може бути від'ємним.")
    } else {
        // Обчислення об'єму
        val volume = (4f / 3f) * PI.toFloat() * radius * radius * radius

        // Обчислення площі поверхні
        val surfaceArea = 4f * PI.toFloat() * radius * radius

        println("Об'єм кулі: $volume")
        println("Площа поверхні кулі: $surfaceArea")
    }

    scanner.close()
}
