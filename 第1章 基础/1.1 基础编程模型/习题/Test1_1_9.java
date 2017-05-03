public class Test1_1_9
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (int i = n; i > 0; i /= 2)
            s = (i % 2) + s;
        StdOut.println(s);
    }
}