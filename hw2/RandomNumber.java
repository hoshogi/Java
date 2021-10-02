package hw2;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] num = new int[4][4];

        for (int i = 0; i < num.length; i++)
            for (int j = 0; j < num[i].length; j++)
                num[i][j] = random.nextInt(10) + 1;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                System.out.print(num[i][j] + "\t");
            System.out.println();
        }
    }
}
