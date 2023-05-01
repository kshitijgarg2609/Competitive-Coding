import java.util.*;

public class Solution
{
    static int B,H;
    static
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            B=sc.nextInt();
            H=sc.nextInt();
            if(B<=0 || H<=0)
            {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            System.out.println((B*H));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    public static void main(String[] args)
    {
    }
}
