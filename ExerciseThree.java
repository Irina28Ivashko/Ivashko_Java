public class ExerciseThree {
    public static void main(String[] args) {
        // Задаем массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа:");

        // Проходим по каждому числу в массиве
        for (int number : numbers) {
            // Проверяем, является ли число чётным
            if (number % 2 == 0) {
                // Выводим чётное число
                System.out.println(number);
            }
        }
    }
}
