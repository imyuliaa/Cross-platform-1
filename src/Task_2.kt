import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введіть сторону A прямокутника: ")
    var A = scanner.nextFloat()
    if (A <= 0) {
        println("Сторона A прямокутника повинна бути додатнім числом.")
        return
    }

    println("Введіть сторону B прямокутника: ")

    var B = scanner.nextFloat()
    if (B <= 0) {
        println("Сторона B прямокутника повинна бути додатнім числом.")
        return
    }

    println("Введіть сторону C квадратів: ")
    var C = scanner.nextFloat()
    if (C <= 0) {
        println("Сторона C квадратів повинна бути додатнім числом.")
        return
    }

    // Знаходимо кількість квадратів
    val squaresCount = (A / C).toInt() * (B / C).toInt()

    // Знаходимо площу незайнятої частини
    val areaUnoccupied = A * B - squaresCount * C * C

    println("Кількість квадратів на прямокутнику: $squaresCount")
    println("Площа незайнятої частини прямокутника: $areaUnoccupied")

    scanner.close()
}
