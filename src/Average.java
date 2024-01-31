import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = 0;
        int sum = 0;
        int quantityEven = 0;
        int sumEven = 0;

        System.out.print("Введите min число диапазона: ");
        int min = scanner.nextInt();

        System.out.print("Введите max число диапазона: ");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            quantity++;
            sum += i;
            if (i % 2 == 0) {
                quantityEven++;
                sumEven += i;
            }
        }
        System.out.println("Среднее арифметическое чисел: " + (double) sum / quantity);
        System.out.println("Среднее арифметическое чётных чисел: " + (double) sumEven / quantityEven);
    }
}