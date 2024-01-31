public class Loop {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            int Multiplicity = getMultiplicity(i);
            if (Multiplicity == 0) {
                System.out.print(i);
            }
        }
    }

    public static int getMultiplicity(int i) {
        return i % 4;

    }
}
