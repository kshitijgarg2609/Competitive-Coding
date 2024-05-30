class Solution
{
    public int countTriplets(int[] arr)
    {
        int cnt=0;
        for(int start=0;start<arr.length;start++)
        {
            for(int end=start+1;end<arr.length;end++)
            {
                int a=arr[start],b=0;
                for(int i=start+1;i<=end;b^=arr[i++]);
                for(int i=start+1;i<=end;i++)
                {
                    if(a==b)
                    {
                        cnt++;
                    }
                    a^=arr[i];
                    b^=arr[i];
                }
            }
        }
        return cnt;
    }
}
