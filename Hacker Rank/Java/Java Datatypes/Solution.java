import java.util.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++)
        {
            String str=sc.nextLine();
            try
            {
                long x=Long.parseLong(str);
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                }
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(str+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
