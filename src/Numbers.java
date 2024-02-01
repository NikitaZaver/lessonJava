import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sumNotEven = 0;
        int maxNumber = 0;

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        for (int i = Math.abs(number); i != 0; i /= 10) {
            sum += i % 10;
            if (i % 2 != 0) {
                sumNotEven += i % 10;
            }
            if (maxNumber < (i % 10)){
                maxNumber = i % 10;
            }
        }
        System.out.println("Сумма всех цифр = "+ sum);
        System.out.println("Сумма всех нечётных цифр = " + sumNotEven);
        System.out.println("Максимальная цифра = " + maxNumber);
    }
}



