import java.util.Arrays;
public class Test1_1_28
{
    public static int rank (int key, int[] a)
    {
        // ��������������
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            // �����ҵļ�Ҫô�����ڣ�Ҫô��Ȼ������a[lo..hi]֮��
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int[] list = new int[whitelist.length];
        int cnt = 0;
        for (int i = 0; i < whitelist.length; i++)
        {
            if (rank(whitelist[i], whitelist) == i)
            {
                list[cnt] = whitelist[i];
                cnt++;
            }
        }
        for (int i = 0; i < list.length; i++)
            StdOut.println(list[i]);
    }
}