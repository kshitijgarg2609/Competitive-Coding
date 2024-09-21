class Solution
{
    public List<Integer> lexicalOrder(int n)
    {
        List<Integer> list = new LinkedList<>();
        for(int i=0,num=1;i<n;i++)
        {
            list.add(num);
            if(num*10<=n)
            {
                num*=10;
                continue;
            }
            for(;num%10==9 || num>=n;num/=10);
            num++;
        }
        return list;
    }
}
