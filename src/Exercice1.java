public class Exercice1 {
    public static int warOfNumbers(int[] data) {

        int totalPair = 0;
        int totalImpair = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                totalPair += data[i];
            } else {
                totalImpair += data[i];
            }
        }

        if (totalPair > totalImpair) {
            return totalPair - totalImpair;
        } else {
            return totalImpair - totalPair;
        }

    }
}
