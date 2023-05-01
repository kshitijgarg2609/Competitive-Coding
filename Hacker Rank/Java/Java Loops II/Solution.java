import java.util.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cnt=a;
            for(int j=0;j<n;j++)
            {
                cnt = cnt + (int)(b*Math.pow(2,j));
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
