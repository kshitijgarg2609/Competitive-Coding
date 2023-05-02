import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            list.add(new ArrayList<>());
            for(int j=0;j<d;j++)
            {
                list.get(i).add(sc.nextInt());
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>list.get(x-1).size())
            {
                System.out.println("ERROR!");
            }
            else
            {
                System.out.println(list.get(x-1).get(y-1));
            }
        }
    }
}
