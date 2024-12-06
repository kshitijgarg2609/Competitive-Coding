class Solution
{
    public int maxCount(int[] banned, int n, int maxSum)
    {
        int cnt=0;
        Set<Integer> set = Arrays.stream(banned).boxed().collect(Collectors.toSet());
        for(int i=1,sum=0;i<=n;i++)
        {
            if(sum+i>maxSum)
            {
                break;
            }
            if(!set.contains(i))
            {
                sum+=i;
                cnt++;
            }
        }
        return cnt;
    }
}
