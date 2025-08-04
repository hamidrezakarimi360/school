package org.example;

import java.util.Scanner;

class S_tudent {
    public static void st() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Enter Your DateOfBirth(yyyy-MM-dd): ");
        String dobInput = input.nextLine();


        Student student = new Student(firstName, lastName, age, dobInput);

        System.out.println("\nInfo Student:");
        System.out.println("Name: " + student.getFirstName());
        System.out.println("LastName: " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Date age: " + student.getDateOfBirth());

        input.close();
    }
}

class S_Lesson {
    public static void on() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Lesson Name: ");
        String bookname = input.nextLine();
        System.out.print("Enter Lesson Code: ");
        int code = input.nextInt();
        Lesson lesson = new Lesson(bookname, code);
        System.out.println("\nInfo Lesson:");
        System.out.println("Name: " + lesson.getNamebook());
        System.out.println("LastName: " + lesson.getCodebook());
        input.close();
    }
}

class T_teacher {
    public static void er() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Teacher Name: ");
        String ferstnameteacher = input.nextLine();

        System.out.print("Enter Teacher Last Name: ");
        String lastnameteacher = input.nextLine();

        System.out.print("Enter Teacher Code: ");
        int teachercode = input.nextInt();

        Teacher teacher = new Teacher(ferstnameteacher, lastnameteacher, teachercode);

        System.out.println("\nInfo Teacher:");
        System.out.println("Name: " + teacher.getTechername());
        System.out.println("LastName: " + teacher.getTecherlastname());
        System.out.println("Code: " + teacher.getTechercode());

        input.close();

    }

}

public class mane {
    public static void main(String[] args) {
        System.out.println("Select an option");
        System.out.println("1_Add Student:");
        System.out.println("2_Add Teacher:");
        System.out.println("3_Add Lesson:");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                S_tudent.st();
                break;
            case 2:
                T_teacher.er();
                break;
            case 3:
                S_Lesson.on();
                break;
        }
    }
}
