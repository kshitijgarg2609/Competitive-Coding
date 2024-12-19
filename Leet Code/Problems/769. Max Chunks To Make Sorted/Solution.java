class Solution
{
    public int maxChunksToSorted(int[] arr)
    {
        int cnt=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Integer.max(max,arr[i]);
            if(max==i)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
