import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine())
        {
            System.out.printf("%d %s\n",i++,sc.nextLine());
        }
        sc.close();
    }
}
