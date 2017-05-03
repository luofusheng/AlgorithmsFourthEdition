public class Test1_1_21
{
    public static void main(String[] args)
    {
        //int N = Integer.parseInt(args[0]);
        String[] s = new String[10];
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];
        int i = 0;
        
        for(i = 0; i < 5; i++)
        {
            s[i] = StdIn.readString();
            a[i] = StdIn.readInt();
            b[i] = StdIn.readInt();
            c[i] = a[i] / b[i];
        }
        for (int j = 0; j <= i; j++)
        {
            StdOut.print(s[i] + " " + a[i] + " " + b[i]);
            StdOut.printf(" %.3f", c[i]);
            StdOut.println();
        }
    }
}