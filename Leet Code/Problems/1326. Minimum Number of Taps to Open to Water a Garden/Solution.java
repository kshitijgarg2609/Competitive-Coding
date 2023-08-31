class Solution
{
    public int minTaps(int n, int[] ranges)
    {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int start=Integer.max(0,i-ranges[i]);
            int end=Integer.min(n,i+ranges[i]);
            arr[start]=Integer.max(arr[start],end);
        }
        int cnt=0;
        for(int i=0,j=0,k=0;i<=n;k=Integer.max(k,arr[i++]))
        {
            if(i>k)
            {
                return -1;
            }
            if(i>j)
            {
                cnt++;
                j=k;
            }
        }
        return cnt;
    }
}
