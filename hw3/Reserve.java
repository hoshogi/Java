package hw3;

import java.util.Scanner;

class Seat {
    private String name;

    public Seat() {
        name = "---";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class seatType {
    private char type;
    private Seat[] seat;

    Scanner sin = new Scanner(System.in);

    public seatType(char type, int num) {
        this.type = type;
        seat = new Seat[num];
        for (int i = 0; i < num; i++)
            seat[i] = new Seat();
    }

    public void reserve() {
        show();
        System.out.print("name>>");
        String name = sin.next();
        System.out.print("number>>");
        int num = sin.nextInt();
        if (num < 1 || num > seat.length) {
            System.out.println("Wrong number.");
            return;
        }
        seat[num - 1].setName(name);
    }

    public void show() {
        System.out.print(type + ">> ");
        for (int i = 0; i < seat.length; i++)
            System.out.print(seat[i].getName() + " ");
        System.out.println();
    }

    public void cancel() {
        show();
        System.out.print("name>>");
        String name = sin.next();
        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i].getName())) {
                seat[i].setName("---");
                break;
            }
            if (i == seat.length - 1)
                System.out.println("Wrong name.");
        }
    }
}

public class Reserve {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        seatType[] aSeatType = new seatType[3];
        aSeatType[0] = new seatType('S', 10);
        aSeatType[1] = new seatType('A', 15);
        aSeatType[2] = new seatType('B', 20);

        int choice = 0;

        while (choice != 4) {
            int type;

            System.out.print("Reservation(1), Search(2), Cancel(3), Exit(4)>>>>");
            choice = sin.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Seat classification S(1), A(2), B(3)>>");
                    type = sin.nextInt();
                    if (type < 1 || type > 3) {
                        System.out.println("Wrong seat type.");
                        break;
                    }
                    aSeatType[type - 1].reserve();
                    break;
                case 2:
                    for (int i = 0; i < aSeatType.length; i++)
                        aSeatType[i].show();
                    System.out.println("<<<You have completed your search.>>>");
                    break;
                case 3:
                    System.out.print("Seat classification S(1), A(2), B(3)>>");
                    type = sin.nextInt();
                    if(type < 1 || type > 3) {
                        System.out.println("Wrong seat type.");
                        break;
                    }
                    aSeatType[type - 1].cancel();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("You entered incorrectly.");
            }
        }
    }
}