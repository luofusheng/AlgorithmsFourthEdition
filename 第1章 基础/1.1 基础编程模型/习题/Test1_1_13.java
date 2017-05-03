public class Test1_1_13
{
    public static void main(String[] args)
    {
        int[][] a = {{1,2,3,4},{5,6,7,8}};
        int[][] b = new int[4][2];
        for (int i = 0; i < 4; i++)
        {
            b[i][0] = a[0][i];
            b[i][1] = a[1][i];
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 2; j++)
               StdOut.printf(b[i][j] + "   ");
            StdOut.println();
        }
    }
}
       