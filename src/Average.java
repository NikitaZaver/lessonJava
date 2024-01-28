public class Average {

    public static void main(String[] args) {
        int a = 3;
        int b = 17;
        int c = b - a + 1;
        int sum = 0;

        do {
            sum += a;
            ++a;
        } while (a<=b);

        System.out.print("Среднее арифметическое чисел равно: " + (double) sum/c);
    }





}



