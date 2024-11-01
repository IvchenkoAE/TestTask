import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Введите первое целое число (a): ");
            int a = scanner.nextInt();
            System.out.print("Введите второе целое число (b): ");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            System.out.println("Сложение: " + (a + b));
            System.out.println("Вычитание: " + (a - b));
            System.out.println("Умножение: " + (a * b));

            if (b != 0) {
                System.out.println("Деление: " + ((double) a / b));
            } else {
                System.out.println("Деление на ноль недопустимо");
            }

            scanner.close();
        }

    public static class StringComparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine();
            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }

            scanner.close();
        }
    }

    public static class EvenNumbers {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Чётные числа в массиве:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }

}

