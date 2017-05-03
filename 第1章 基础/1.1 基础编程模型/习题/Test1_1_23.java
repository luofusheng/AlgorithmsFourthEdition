import java.util.Arrays;
public class Test1_1_23
{
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else         return mid;
        }
        return -1;
    }
    public static void main (String[] args)
    {
        //String s = args[0];
        String s = "-";
        int[] whitelist = In.readInts(args[1]);
        Arrays.sort(whitelist);
        int result = 0;
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            result = rank(key, whitelist);
            if (result < 0)
            {
                if (s == "+")
                    StdOut.println(key);
                else
                    continue;
            }
            else if (s == "-")
                StdOut.println(key);
            else 
                continue;
        }
    }
}
              
            
                