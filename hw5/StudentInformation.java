package hw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    private String name;
    private String department;
    private int num;
    private double score;

    Student(String name, String department, int num, double score) {
        this.name = name;
        this.department = department;
        this.num = num;
        this.score = score;
    }

    public String toString() {
        String str = "";

        str += "---------------------------------------------\n";
        str += "student name    :       " + name + "\n";
        str += "department      :       " + department + "\n";
        str += "student #       :       " + num + "\n";
        str += "average score   :       " + score + "\n";
        str += "---------------------------------------------\n";
        return str;
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> al = new ArrayList<Student>();

        System.out.println("Enter student information");
        System.out.println();
        while (true) {
            System.out.print("student name    : ");
            String name = scanner.nextLine();
            System.out.print("department      : ");
            String department = scanner.nextLine();
            System.out.print("student #       : ");
            int num = scanner.nextInt();
            System.out.print("average score   : ");
            double score = scanner.nextDouble();

            al.add(new Student(name, department, num, score));

            System.out.println();
            System.out.print("Are you finished entering the data? (Yes (y), No (n)) : ");
            String answer = scanner.next();
            scanner.nextLine();
            if (answer.equals("y"))
                break;
        }

        Iterator<Student> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}