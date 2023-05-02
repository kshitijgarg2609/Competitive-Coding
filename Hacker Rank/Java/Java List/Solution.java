import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String str=sc.next();
            switch(str)
            {
                case "Insert":
                {
                    list.add(sc.nextInt(),sc.nextInt());
                    break;
                }
                case "Delete":
                {
                    list.remove(sc.nextInt());
                    break;
                }
            }
        }
        for(int x : list)
        {
            System.out.print(x+" ");
        }
    }
}
