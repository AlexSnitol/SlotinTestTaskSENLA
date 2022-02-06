package task1;

import java.util.Scanner;

public class Main
{
    public static int getSumNumFromString(String str)
    {
        int sum = 0;

        for (int sym : str.toCharArray())
        {
            if (sym >= 48 && sym <= 57)
                sum += sym - 48;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("TASK 1");
        System.out.println();

        int sum = 0;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string:");
        System.out.print("> ");
        str = sc.nextLine();
        System.out.println("sum numbers: " + getSumNumFromString(str));
    }
}
