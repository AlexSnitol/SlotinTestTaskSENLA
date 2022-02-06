package task2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main
{
    public static void printSimpleMultipliers(int num, boolean p)
    {
        if (num == 0)
            return;

        int k = 1;    //count multipliers
        int tmpm = 0; //temp multiplier
        int pnum = abs(num); //positive number

        for (int m = pnum - 1; m != 1; m--)
        {
            if (pnum % m == 0)
            {
                k++;

                if (m*m == pnum)
                    tmpm = m;

                if (tmpm * m == pnum)
                {
                    if (num < 0)
                        tmpm = 0 - tmpm;

                    printSimpleMultipliers(tmpm, p);
                    printSimpleMultipliers(m, true);

                    return;
                }

                tmpm = m;
            }
        }

        if (k == 1)
        {
            if (p)
                System.out.print("*");

            System.out.print(num);
        }

        return;
    }

    public static void main(String [] args)
    {
        System.out.println("TASK 2");
        System.out.println();

        float fnum;
        int inum;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer number:");
        System.out.print("> ");
        fnum = sc.nextFloat();
        inum = (int)fnum;

        if (fnum != inum)
        {
            System.out.println("error! please enter an integer number.");
            return;
        }

        System.out.println("result:");
        printSimpleMultipliers(inum, false);
    }
}

//32
//16 8 4 2

//      32
//     /   \
//    8     4
//   /|\   / \
//  2 2 2 2   2