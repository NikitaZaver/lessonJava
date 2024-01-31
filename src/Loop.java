public class Loop {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            boolean multiplicity = getMultiplicity(i);
            if (multiplicity) {
                System.out.print(i);
            }
        }
    }

    public static boolean getMultiplicity(int i) {
        return i % 4 == 0;

    }
}
