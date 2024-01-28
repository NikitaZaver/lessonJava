public class Average {
    public static void main(String[] args) {
        int kol = 0;
        int sum = 0;
        int a = 3;
        int b = 17;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                kol++;
                sum += i;
            }
        }
        System.out.println("Среднее арифметическое четных чисел: " + (double) sum / kol);
    }
}
