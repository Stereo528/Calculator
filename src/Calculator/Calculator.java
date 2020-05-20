package Calculator;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Calculator {
    static void add(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
            System.out.println(x + y);
    }
    static void sub(){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Choose a number");
        x = input.nextInt();
        System.out.println("Choose another number");
        y = input.nextInt();
        System.out.println(x - y);
    }
    static void mul() {
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
        System.out.println("add, subtract, multiply, divide, square, Square root, AbVal, Powers, quit: ");
        Scanner input = new Scanner(System.in);
        int x;
        String operation = input.nextLine();
        switch (operation) {
            case "quit":
                    break;
            case "add":
                add();
                break;
            case "subtract":
                sub();
                break;
            case "multiply":
                mul();
                break;
            case "divide":
                div();
                break;
            case "square":
                sqr();
                break;
            case "sqroot":
                sqroot();
                break;
            case "absolute":
                abval();
                break;
            case "powers":
                power();
                break;
            default:
                System.out.println("Not a Valid Option");
        }

        input.close();
    }
}
