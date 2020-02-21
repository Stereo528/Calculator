import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {
    static void Add(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(x + y);
    }
    static void Sub(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(x - y);
    }
    static void Mul() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(x * y);
    }
    static void div(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(x / y);
    }
    static void sqr(){
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println(x * x);
    }
    static void sqroot() {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println(sqrt(x));
    }
    static void abval(){
            Scanner input = new Scanner(System.in);
            int x;
            System.out.println("Choose a number");
            x = input.nextInt();
            System.out.println(Math.abs(x));
    }
    static void power(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(Math.pow(x,y));
    }
    public static void main(String[] args) {
        System.out.println("add(1), subtract(2), multiply(3), divide(4), square(5), Square root(6), AbVal(7), Powers(8), quit(0): ");
        Scanner input = new Scanner(System.in);
        int operation, x;
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
                Add();
                break;
            case 2:
                Sub();
                break;
            case 3:
                Mul();
                break;
            case 4:
                div();
                break;
            case 5:
                sqr();
                break;
            case 6:
                sqroot();
                break;
            case 7:
                abval();
                break;
            case 8:
                power();
                break;
            default:
                System.out.println("Not a Valid Option");
        }

        input.close();
    }
}
