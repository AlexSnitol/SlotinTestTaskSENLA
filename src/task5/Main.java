package task5;

import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        System.out.println("TASK 5");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int n;
        int w;

        System.out.println("enter weight safe:");
        System.out.print("> ");
        w = sc.nextInt();

        if (w <= 0)
        {
            System.out.println("error! please enter weight > 0!");
            return;
        }

        System.out.println("enter count items:");
        System.out.print("> ");
        n = sc.nextInt();

        if (n <= 0)
        {
            System.out.println("error! please enter count > 0!");
            return;
        }

        int[] wI = new int[n];
        int[] cI = new int[n];

        System.out.println("enter with a space weight and cost items:");
        System.out.println("sample: 10 20");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " item > ");

            wI[i-1] = sc.nextInt();
            if (wI[i-1] <= 0)
            {
                System.out.println("error! please enter weight > 0!");
                return;

            }

            cI[i-1] = sc.nextInt();
            if (cI[i-1] <= 0)
            {
                System.out.println("error! please enter cost > 0!");
                return;
            }
        }

        Safe obj1 = new Safe(w);

        System.out.println("result:");
        obj1.printItemsMaxCost(n, wI, cI);
    }
}
