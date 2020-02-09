import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add(1), subtract(2), multiply(3), divide(4), square(5), Square root(6), quit(0): ");
        Scanner input = new Scanner(System.in);
        int operation, x, y;
        operation = input.nextInt();
        switch (operation) {
            case 0:
                System.out.println("Confirm(0), Cancel(1)");
                x = input.nextInt();
                if (x == 0)
                    break;
                else
                    System.out.println("idk how to make this work yet, closing");
                    break;
            case 1:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println("Choose another number");
                y = input.nextInt();
                System.out.println(x + y);
                break;
            case 2:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println("Choose another number");
                y = input.nextInt();
                System.out.println(x - y);
                break;
            case 3:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println("Choose another number");
                y = input.nextInt();
                System.out.println(x * y);
                break;
            case 4:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println("Choose another number");
                y = input.nextInt();
                System.out.println(x / y);
                break;
            case 5:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println(x * x);
                break;
            case 6:
                System.out.println("Choose a number");
                x = input.nextInt();
                System.out.println(sqrt(x));
                break;
            default:
                System.out.println("Not a Valid Option");
        }
    }
}
