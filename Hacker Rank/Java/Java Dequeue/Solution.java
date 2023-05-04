import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer,Integer> map = new HashMap<>();
        int max=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            deque.addLast(num);
            map.put(num,map.getOrDefault(num,0)+1);
            if(deque.size()==m)
            {
                max=Integer.max(max,map.size());
                int rem=deque.removeFirst();
                if(map.put(rem,map.get(rem)-1)==1)
                {
                    map.remove(rem);
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
