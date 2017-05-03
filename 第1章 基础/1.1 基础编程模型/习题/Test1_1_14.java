public class Test1_1_14
{
    public static int lg(int N)
    {
        int cnt = 0;
        for (int i = N; i > 0; i /= 2)
            cnt++;
        return cnt - 1;
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int Res = lg(N);
        StdOut.println(Res);
    }
}