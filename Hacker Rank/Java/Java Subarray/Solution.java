import java.util.*;
import java.util.stream.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pre[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            pre[i]=pre[i-1]+sc.nextInt();
        }
        sc.close();
        List<Integer> list = Arrays.stream(pre).sorted().boxed().collect(Collectors.toList());
        int sum=0;
        for(int x : pre)
        {
            int left=-1;
            int right=list.size()-1;
            while((right-left)>1)
            {
                int mid=(left+right+1)/2;
                if(x<=list.get(mid))
                {
                    right=mid;
                }
                else
                {
                    left=mid;
                }
            }
            list.remove(right);
            sum+=right;
        }
        System.out.println(sum);
    }
}
