import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet bits[] = new BitSet[]{new BitSet(n),new BitSet(n)};
        for(int i=0;i<m;i++)
        {
            String q=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            switch(q)
            {
                case "AND":
                {
                    bits[a-1].and(bits[b-1]);
                    break;
                }
                case "OR":
                {
                    bits[a-1].or(bits[b-1]);
                    break;
                }
                case "XOR":
                {
                    bits[a-1].xor(bits[b-1]);
                    break;
                }
                case "FLIP":
                {
                    bits[a-1].flip(b);
                    break;
                }
                case "SET":
                {
                    bits[a-1].set(b);
                    break;
                }
            }
            System.out.println(bits[0].cardinality()+" "+bits[1].cardinality());
        }
    }
}
