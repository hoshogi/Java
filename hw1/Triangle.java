package hw1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오>> ");

        int[] side = new int[3];
        for (int i = 0;i < 3;i++)
            side[i]= scanner.nextInt();

        if ((side[0] + side[1]) > side[2] || (side[1] + side[2]) > side[0] || (side[0] + side[2]) > side[1])
            System.out.println("삼각형 세 변의 길이가 될 수 있습니다.");
        else
            System.out.println("삼각형 세 변의 길이가 될 수 없습니다.");
    }
}
