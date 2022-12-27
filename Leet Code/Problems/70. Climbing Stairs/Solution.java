class Solution
{
    public int climbStairs(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int len=n+1;
        int arr[] = new int[len];
        arr[0]=1;
        for(int i=0;i<len;i++)
        {
            if(i+1<len)
            {
                arr[i+1]+=arr[i];
            }
            if(i+2<len)
            {
                arr[i+2]+=arr[i];
            }
        }
        return arr[n];    
    }
}
