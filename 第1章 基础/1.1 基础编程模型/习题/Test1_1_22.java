import java.util.Arrays;

public class Test1_1_22
{
    static int i = 0;
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length - 1);
    }
    public static int rank(int key, int[] a, int lo, int hi)
    {
        // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        i++;
        for(int j = 0; j < i; j++)
            StdOut.print(" ");
        StdOut.println(lo + " " + hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else                   return mid;
    }
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int key = StdIn.readInt();
        if (rank(key, whitelist) > 0)
            StdOut.println("find");
        else StdOut.println("not find");
    }
}