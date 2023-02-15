import java.util.Arrays;

public class Exercice2 {
    public static void execute() {
        int[][] dataJson = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int[] data : dataJson) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[j]+" ");
            }
            System.out.println();
        }
    }

}

