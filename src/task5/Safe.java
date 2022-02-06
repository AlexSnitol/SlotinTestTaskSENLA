package task5;

public class Safe
{
    private int w;

    Safe() {}

    Safe(int w)
    {
        this.w = w;
    }

    public int getW()
    {
        return w;
    }

    public void setW(int w)
    {
        this.w = w;
    }

    public void printItemsMaxCost(int n, int[] wI, int[] cI)
    {
        int [][] a = new int[n+1][this.w+1];

        for(int i = 0; i <= n; i++)
            a[i][0] = 0;

        for(int j = 1; j <= this.w; j++)
            a[0][j] = 0;

        //fill array with cost
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= this.w; j++)
            {
                if (j >= wI[i - 1])
                {
                    if (a[i - 1][j] > a[i - 1][j - wI[i - 1]] + cI[i - 1])
                        a[i][j] = a[i - 1][j];
                    else
                        a[i][j] = a[i - 1][j - wI[i - 1]] + cI[i-1];
                }
                else
                    a[i][j] = a[i - 1][j];
            }
        }

        //find and print items
        int j = this.w;

        for(int i = n; i >= 1; i--)
        {
            if (a[i][j] == 0)
                return;

            if (a[i - 1][j] != a[i][j])
            {
                System.out.print(i + ";");
                j -= wI[i - 1];
            }
        }

    }
}
