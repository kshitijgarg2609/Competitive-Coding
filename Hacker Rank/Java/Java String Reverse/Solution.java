import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        boolean flg=true;
        for(int i=0;flg && i<A.length()/2;i++)
        {
            if(A.charAt(i)!=A.charAt(A.length()-i-1))
            {
                flg=false;
            }
        }
        System.out.println((flg?"Yes":"No"));
    }
}
