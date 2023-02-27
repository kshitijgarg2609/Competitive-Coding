class Solution
{
    public int findKthPositive(int[] arr, int k)
    {
        int indx=1;
        for(int x : arr)
        {
            int miss=x-indx;
            if((k-miss)>0)
            {
                k-=miss;
            }
            else
            {
                break;
            }
            indx=x+1;
        }
        return (indx+k-1);
    }
}
