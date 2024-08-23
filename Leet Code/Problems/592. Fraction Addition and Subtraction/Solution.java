class Solution
{
    public String fractionAddition(String expression)
    {
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0,end=0;i<expression.length();i=end)
        {
            int div = expression.indexOf('/',i);
            end = div+2;
            for(;end<expression.length() && expression.charAt(end)!='+' && expression.charAt(end)!='-';end++);
            int f[] = new int[]{Integer.parseInt(expression.substring(i,div)),Integer.parseInt(expression.substring(div+1,end))};
            adjustFraction(f);
            qu.add(f);
        }
        for(;qu.size()>1;qu.add(fractionAddition(qu.remove(),qu.remove())));
        int f[] = qu.remove();
        for(int gcd=1;f[0]!=0 && (gcd=gcd(f[0],f[1]))!=1;f=new int[]{f[0]/gcd,f[1]/gcd});
        adjustFraction(f);
        return String.format("%d/%d",f[0],f[1]);
    }
    void adjustFraction(int f[])
    {
        if(f[1]<0)
        {
            f[0]=-f[0];
            f[1]=-f[1];
        }
    }
    int[] fractionAddition(int a[],int b[])
    {
        int f[] = new int[]{0,lcm(a[1],b[1])};
        f[0]=((f[1]*a[0])/a[1])+((f[1]*b[0])/b[1]);
        if(f[0]==0)
        {
            f[1]=1;
        }
        return f;
    }
    int gcd(int a, int b)
    {
        return (b==0)?a:gcd(b,a%b);
    }
    int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
}
