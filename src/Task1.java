import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус кулі: ");
        float radius = scanner.nextFloat();

        if (radius < 0) {
            System.out.println("Некоректний ввід даних. Радіус не може бути від'ємним.");
        } else {
            // Обчислення об'єму
            float volume = (4f / 3f) * (float) Math.PI * radius * radius * radius;

            // Обчислення площі поверхні
            float surfaceArea = 4f * (float) Math.PI * radius * radius;

            System.out.println("Об'єм кулі: " + volume);
            System.out.println("Площа поверхні кулі: " + surfaceArea);
        }

        scanner.close();
    }
}

