import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add(1), subtract(2), multiply(3), divide(4), square(5), Square root(6), quit(0): ");
        Scanner input = new Scanner(System.in);
        int operation, x, y;
        operation = input.nextInt();
        if (operation == 0) {
            do {
                System.out.println("stopping");
                break;
            } while (true);
        }
        if (operation == 1) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println("Choose another number");
            y = input.nextInt();
            System.out.println(x + y);
        }
        if (operation == 2) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println("Choose another number");
            y = input.nextInt();
            System.out.println(x - y);
        }
        if (operation == 3) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println("Choose another number");
            y = input.nextInt();
            System.out.println(x * y);
        }
        if (operation == 4) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println("Choose another number");
            y = input.nextInt();
            System.out.println(x / y);
        }
        if (operation == 5) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println(x * x);
        }
        if (operation == 6) {
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println(sqrt(x));
        }





    }
}