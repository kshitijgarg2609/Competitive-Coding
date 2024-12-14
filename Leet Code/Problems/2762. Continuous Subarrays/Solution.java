class Solution
{
    public long continuousSubarrays(int[] nums)
    {
        long cnt=0L;
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b)->Integer.compare(nums[a],nums[b]));
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->Integer.compare(nums[b],nums[a]));
        for(int l=0,r=0;r<nums.length;r++)
        {
            min.add(r);
            max.add(r);
            for(;l<r && nums[max.peek()]-nums[min.peek()]>2;l++)
            {
                for(;!max.isEmpty() && max.peek()<=l;max.remove());
                for(;!min.isEmpty() && min.peek()<=l;min.remove());
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}
