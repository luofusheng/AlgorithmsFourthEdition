public class Fibonacci_1_1_19
{
    /*
    // 原来的实现
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
    
    public static void main(String[] args)
    {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
     */
    
    // 现在的实现
    public static long[] F(int N)
    {
        long[] a = new long[N+1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= N; i++)
            a[i] = a[i-1] + a[i-2];
        return a;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        long[] a = F(N);
        for (int i = 0; i <= N; i++)
            StdOut.println(i + " " + a[i]);
        //StdOut.println(N + " " + a[N]);
    }
}
    