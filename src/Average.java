import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = 0;
        int sum = 0;
        int quantity1 = 0;
        int sum1 = 0;

        System.out.print("Введите min число диапазона: ");
        int min = scanner.nextInt();

        System.out.print("Введите max число диапазона: ");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            quantity++;
            sum += i;
        }
        System.out.println("Среднее арифметическое чисел: " + (double) sum / quantity);

        for (int j = min; j <= max; j++) {
            if (j % 2 == 0) {
                quantity1++;
                sum1 += j;
            }
    }
        System.out.println("Среднее арифметическое чётных чисел: " + (double) sum1 / quantity1);
}
}