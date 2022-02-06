package task4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("TASK 4");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        byte v = 0;

        System.out.println("menu:");
        System.out.println("1. enter double number");
        System.out.println("2. enter string number");

        System.out.print("> ");
        v = sc.nextByte();

        if (v == 1)
        {
            double num = 0;
            System.out.println("enter any number:");
            System.out.print("> ");
            num = sc.nextDouble();

            ConsoleNumber obj1 = new ConsoleNumber(num);

            obj1.printNumberDouble();
        }
        else if (v == 2)
        {
            String numS;
            System.out.println("enter any number:");
            System.out.print("> ");
            numS = sc.next();

            ConsoleNumber obj2 = new ConsoleNumber(numS);

            obj2.printNumberString();
        }
    }
}
