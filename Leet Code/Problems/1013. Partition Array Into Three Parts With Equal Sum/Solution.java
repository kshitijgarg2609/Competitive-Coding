class Solution
{
    public boolean canThreePartsEqualSum(int[] arr)
    {
        int total_sum=Arrays.stream(arr).sum();
        if(total_sum%3!=0)
        {
            return false;
        }
        total_sum/=3;
        int sum=0;
        int cnt=0;
        for(int x : arr)
        {
            sum+=x;
            if(sum==total_sum)
            {
                sum=0;
                cnt++;
            }
        }
        return cnt>=3;
    }
}
