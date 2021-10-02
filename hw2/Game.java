package hw2;

public class Game {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            int count = 0;
            String num = Integer.toString(i);

            for (int j = 0; j < num.length(); j++) {
                switch (num.charAt(j)) {
                    case '3':
                    case '6':
                    case '9':
                        count++;
                        break;
                }
            }

            if (count == 1) {
                System.out.println(num + " 박수 한번");
            } else if (count == 2) {
                System.out.println(num + " 박수 두번");
            }
        }
    }
}
