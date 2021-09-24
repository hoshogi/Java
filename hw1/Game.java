package hw1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        String num = scanner.nextLine();
        for (int i = 0;i < num.length();i++) {
            if ((num.charAt(i) - '0') % 3 == 0)
                count++;
        }

        if (count == 0)
            System.out.println("없음");
        else if (count == 1)
            System.out.println("박수짝");
        else if (count == 2)
            System.out.println("박수짝짝");
    }
}
