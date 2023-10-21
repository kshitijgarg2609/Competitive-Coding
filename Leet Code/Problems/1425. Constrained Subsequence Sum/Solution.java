class Solution
{
    public int constrainedSubsetSum(int[] nums, int k)
    {
        Deque<Integer> dq = new LinkedList<>();
        int dp[] = new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && (i-dq.peekFirst())>k)
            {
                dq.removeFirst();
            }
            dp[i]=(!dq.isEmpty()?dp[dq.peek()]:0)+nums[i];
            max=Integer.max(max,dp[i]);
            for(;!dq.isEmpty() && dp[dq.peekLast()]<dp[i];dq.removeLast());
            if(dp[i]>0)
            {
                dq.add(i);
            }
        }
        return max;
    }
}
