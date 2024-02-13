class Solution
{
    public int climbStairs(int n)
    {
        int arr[] = new int[n+1];
        arr[0]=1;
        for(int i=0;i<n+1;i++)
        {
            for(int j=1;j<=2 && i+j<n+1;j++)
            {
                arr[i+j]+=arr[i];
            }
        }
        return arr[n];    
    }
}
