package new1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Choice;
        System.out.println("--==Simple java calculator==--");
        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Select an operation to perform:");

            System.out.println("1 Addition");
            System.out.println("2 subtraction");
            System.out.println("3 multiplication");
            System.out.println("4 Division");
            System.out.println("5 Modulus");

            System.out.println("Enter your choice:");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Addition of " + num1 + "and" + num2 + " is:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction of " + num1 + "and" + num2 + " is:" + (num1 + num2));
                    break;
                case 3:
                    System.out.println(" Multiplication of " + num1 + " and" + num2 + " is:" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Division of " + num1 + " by" + num2 + "is:" + (num1 / num2));
                    } else {
                        System.out.println(" Error cannot divide by zero! ");

                    }
                    break;
                case 5:
                    System.out.println("Modulus of" + num1 + "and " + num2 + " is:" + (num1 % num2));
                    break;

                default:
                    System.out.println("Invalid choice ");
            }
            System.out.println("==================================================");
            System.out.println(" Want to perform another operation? (y/n):");
            Choice = sc.next().charAt(0);

        } while (Choice == 'y' || Choice == 'Y');
        sc.close();
    }

}