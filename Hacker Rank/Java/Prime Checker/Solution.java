import java.io.*;

class Prime
{
    void checkPrime(int... n)
    {
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<2)
            {
                continue;
            }
            int d=0;
            for(int j=2;d<1 && j<=Math.sqrt(n[i]);j++)
            {
                if(n[i]%j==0)
                {
                    d++;
                }
            }
            if(d==0)
            {
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
    }
}

public class Solution
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime prime = new Prime();
        prime.checkPrime(n1);
        prime.checkPrime(n1,n2);
        prime.checkPrime(n1,n2,n3);
        prime.checkPrime(n1,n2,n3,n4,n5);
        br.close();
    }
}
