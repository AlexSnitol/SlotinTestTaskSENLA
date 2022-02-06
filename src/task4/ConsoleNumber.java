package task4;

import static java.lang.Math.abs;

public class ConsoleNumber
{
    private double num;
    private String numS;

    ConsoleNumber() {}

    ConsoleNumber(double num)
    {
        this.num = num;
    }

    ConsoleNumber(String numS)
    {
        this.numS = numS;
    }

    public double getNum()
    {
        return num;
    }

    public void setNum(double num)
    {
        this.num = num;
    }

    public String getNumS()
    {
        return numS;
    }

    public void setNumS(String numS)
    {
        this.numS = numS;
    }

    public void printSym(char symbol, char c, int row)
    {
        switch (symbol)
        {
            case '0':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(" " + c + "   " + c + " ");
                        break;
                    case 3:
                        System.out.print(c + "     " + c);
                        break;
                    case 4:
                        System.out.print(c + "     " + c);
                        break;
                    case 5:
                        System.out.print(c + "     " + c);
                        break;
                    case 6:
                        System.out.print(" " + c + "   " + c + " ");
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '1':
                switch (row)
                {
                    case 1:
                        System.out.print("   " + c + "   ");
                        break;
                    case 2:
                        System.out.print("  " + c + "" + c + "   ");
                        break;
                    case 3:
                        System.out.print("   " + c + "   ");
                        break;
                    case 4:
                        System.out.print("   " + c + "   ");
                        break;
                    case 5:
                        System.out.print("   " + c + "   ");
                        break;
                    case 6:
                        System.out.print("   " + c + "   ");
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '2':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(c + "     " + c);
                        break;
                    case 3:
                        System.out.print(c + "     " + c);
                        break;
                    case 4:
                        System.out.print("    " + c + "  ");
                        break;
                    case 5:
                        System.out.print("  " + c + "    ");
                        break;
                    case 6:
                        System.out.print(c + "      ");
                        break;
                    case 7:
                        System.out.print(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
                        break;
                }
                break;
            case '3':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(c + "     " + c);
                        break;
                    case 3:
                        System.out.print("     " + c + " ");
                        break;
                    case 4:
                        System.out.print("    " + c + "  ");
                        break;
                    case 5:
                        System.out.print("      " + c);
                        break;
                    case 6:
                        System.out.print(c + "     " + c);
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '4':
                switch (row)
                {
                    case 1:
                        System.out.print("    " + c + "  ");
                        break;
                    case 2:
                        System.out.print("  " + c + " " + c + "  ");
                        break;
                    case 3:
                        System.out.print(" " + c + "  " + c + "  ");
                        break;
                    case 4:
                        System.out.print(c + "   " + c + "  ");
                        break;
                    case 5:
                        System.out.print(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
                        break;
                    case 6:
                        System.out.print("    " + c + "  ");
                        break;
                    case 7:
                        System.out.print("    " + c + "  ");
                        break;
                }
                break;
            case '5':
                switch (row)
                {
                    case 1:
                        System.out.print(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
                        break;
                    case 2:
                        System.out.print(c + "      ");
                        break;
                    case 3:
                        System.out.print(c + "      ");
                        break;
                    case 4:
                        System.out.print(" " + c + "" + c + "" + c + "" + c + "" + c + " ");
                        break;
                    case 5:
                        System.out.print("      " + c);
                        break;
                    case 6:
                        System.out.print(c + "     " + c);
                        break;
                    case 7:
                        System.out.print(" " + c + "" + c + "" + c + "" + c + "" + c + " ");
                        break;
                }
                break;
            case '6':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(c + "     " + c);
                        break;
                    case 3:
                        System.out.print(c + "      ");
                        break;
                    case 4:
                        System.out.print(c + " " + c + "" + c + "" + c + "  ");
                        break;
                    case 5:
                        System.out.print(c + "     " + c);
                        break;
                    case 6:
                        System.out.print(c + "     " + c);
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '7':
                switch (row)
                {
                    case 1:
                        System.out.print(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
                        break;
                    case 2:
                        System.out.print(c + "    " + c + " ");
                        break;
                    case 3:
                        System.out.print("    " + c + "  ");
                        break;
                    case 4:
                        System.out.print("   " + c + "   ");
                        break;
                    case 5:
                        System.out.print("  " + c + "    ");
                        break;
                    case 6:
                        System.out.print(" " + c + "     ");
                        break;
                    case 7:
                        System.out.print(c + "      ");
                        break;
                }
                break;
            case '8':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(c + "     " + c);
                        break;
                    case 3:
                        System.out.print(c + "     " + c);
                        break;
                    case 4:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 5:
                        System.out.print(c + "     " + c);
                        break;
                    case 6:
                        System.out.print(c + "     " + c);
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '9':
                switch (row)
                {
                    case 1:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 2:
                        System.out.print(c + "     " + c);
                        break;
                    case 3:
                        System.out.print(c + "     " + c);
                        break;
                    case 4:
                        System.out.print("  " + c + "" + c + "" + c + " " + c);
                        break;
                    case 5:
                        System.out.print("      " + c);
                        break;
                    case 6:
                        System.out.print(c + "     " + c);
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case '-':
                switch (row)
                {
                    case 1:
                        System.out.print("       ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("       ");
                        break;
                    case 4:
                        System.out.print(" " + c + "" + c + "" + c + "" + c + "" + c + " ");
                        break;
                    case 5:
                        System.out.print("       ");
                        break;
                    case 6:
                        System.out.print("       ");
                        break;
                    case 7:
                        System.out.print("       ");
                        break;
                }
                break;
            case ',':
            case '.':
                switch (row)
                {
                    case 1:
                        System.out.print("       ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("       ");
                        break;
                    case 4:
                        System.out.print("       ");
                        break;
                    case 5:
                        System.out.print("       ");
                        break;
                    case 6:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                    case 7:
                        System.out.print("  " + c + "" + c + "" + c + "  ");
                        break;
                }
                break;
            case ' ':
            default:
                switch (row)
                {
                    case 1:
                        System.out.print("       ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("       ");
                        break;
                    case 4:
                        System.out.print("       ");
                        break;
                    case 5:
                        System.out.print("       ");
                        break;
                    case 6:
                        System.out.print("       ");
                        break;
                    case 7:
                        System.out.print("       ");
                        break;
                }
                break;
        }
    }

    public void printNumberString()
    {
        char max = 48;

        for (char sym : this.numS.toCharArray())
        {
            if ((sym >= 48 && sym <= 57) && sym > max)
                max = sym;

            if (sym == '9')
                break;
        }

        for (int i = 1; i <= 7; i++)
        {
            for (char sym : this.numS.toCharArray())
            {
                if (sym == max)
                    this.printSym(sym, sym, i);
                else
                    this.printSym(sym, '*', i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printNumberDouble()
    {
        double pnum = abs(this.num);
        long x = 1;
        long tmpx = 1;
        double tmpnum = pnum;
        long d = 0;
        int maxd = 0;
        char c;

        do
        {
            x *= 10;
        }
        while (x <= pnum);

        tmpx = x;


        //find maximal digit
        while (x > 1)
        {
            x /= 10;
            d = (long)tmpnum / x;
            if (d > maxd)
                maxd = (int)d;
            if (d == 9)
                break;
            tmpnum %= x;
        }
        x = 1;
        while (tmpnum != (long) tmpnum)
        {
            x *= 10;
            tmpnum *= 10;
        }
        while (x > 1)
        {
            x /= 10;
            d = (long)tmpnum / x;
            if (d > maxd)
                maxd = (int)d;
            if (d == 9)
                break;
            tmpnum %= x;
        }

        x = tmpx;
        tmpnum = pnum;


        //print digits
        for (int i = 1; i <= 7; i++)
        {
            if (this.num < 0)
                this.printSym('-', '*', i);

            while (x > 1)
            {
                x /= 10;
                d = (long) tmpnum / x;
                c = (char)(d + '0');
                if ((int)d == maxd)
                    this.printSym(c, c, i);
                else
                    this.printSym(c, '*', i);
                tmpnum %= x;
                System.out.print(" ");
            }

            if (tmpnum != (long)tmpnum)
            {
                this.printSym('.', '*', i);

                x = 1;
                while (tmpnum != (long) tmpnum)
                {
                    x *= 10;
                    tmpnum *= 10;
                }

                while (x > 1)
                {
                    x /= 10;
                    d = (long) tmpnum / x;
                    c = (char)(d + '0');
                    if ((int)d == maxd)
                        this.printSym(c, c, i);
                    else
                        this.printSym(c, '*', i);
                    tmpnum %= x;
                    System.out.print(" ");
                }
            }

            x = tmpx;
            tmpnum = pnum;
            System.out.println();
        }
    }
}
