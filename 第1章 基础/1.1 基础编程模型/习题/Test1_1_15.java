public class Test1_1_15
{
    public static int find(int n, int[] a)
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++)
            if (n == a[i])
               cnt++;
        return cnt;
    }
    public static int[] histogram(int[] a, int M)
    {
        int[] b = new int[M];
        for (int i = 0; i < b.length; i++)
            b[i] = find(i, a);
        return b;
    }
    public static void main(String[] args)
    {
        int sum = 0;
        int[] a = {1, 4, 4, 7, 2, 5, 8, 0, 9, 3};
        int M = Integer.parseInt(args[0]);
        int[] b = histogram(a, M);
        for (int i = 0; i < b.length; i++)
            sum += b[i];
        if (sum == a.length)
            StdOut.println("victory");
        else StdOut.println("defeat");
    }
}
    