class Solution
{
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[nums.length-k+1];
        for(int i=0,j=0;i<nums.length;i++)
        {
            for(;!dq.isEmpty() && nums[dq.peekLast()]<nums[i];dq.pollLast());
            dq.addLast(i);
            if(!dq.isEmpty() && dq.peekFirst()==i-k)
            {
                dq.pollFirst();
            }
            if(i>=k-1)
            {
                ans[j++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
