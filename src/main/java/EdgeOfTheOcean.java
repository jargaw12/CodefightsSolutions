import java.util.Arrays;

public class EdgeOfTheOcean {
    int adjacentElementsProduct(int[] inputArray) {
        int a = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            if ((inputArray[i] * inputArray[i + 1]) > a) a = (inputArray[i] * inputArray[i + 1]);
        }
        return a;
    }

    int shapeArea(int n) {
        return n * n + (n - 1) * (n - 1);
    }

    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        return statues[statues.length - 1] - statues[0] + 1 - statues.length;

    }

    boolean almostIncreasingSequence(int[] sequence) {
        int poprzednik = 0;

        int n = 0;
        int p = 1;
        if (sequence[poprzednik] >= sequence[1]) {
            n++;
            p++;
            poprzednik = 1;
        }
        for (int i = p; i < sequence.length - 1; i++) {
            if (sequence[poprzednik] <= sequence[i] && sequence[i] >= sequence[i + 1] && (i + 2) < sequence.length) {
                if (sequence[i + 1] <= sequence[i + 2] && sequence[i + 1] <= sequence[poprzednik]) {
                    poprzednik = i;
                } else n++;
            } else if (sequence[poprzednik] >= sequence[i] && sequence[i] <= sequence[i + 1]) {
                n++;
            } else poprzednik = i;
        }
        if (sequence[sequence.length - 1] <= sequence[poprzednik] && poprzednik != (sequence.length - 1)) {
            n++;
        }

        if ((n == 1) || n == 0) {
            return true;
        }
        return false;
    }

    int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > 0) sum += matrix[j][i];
                else break;
            }
        }
        return sum;
    }
}
