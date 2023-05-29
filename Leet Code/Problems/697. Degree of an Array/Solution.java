class Solution
{
    public int findShortestSubArray(int[] nums)
    {
        Map<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val[] = map.getOrDefault(nums[i],new int[]{0,-1,-1});
            val[0]++;
            val[2]=i;
            if(val[1]==-1)
            {
                val[1]=i;
                map.put(nums[i],val);
            }
        }
        int freq=0;
        int ans=0;
        for(int val[] : map.values())
        {
            if(val[0]>freq)
            {
                freq=val[0];
                ans=val[2]-val[1]+1;
            }
            else if(val[0]==freq)
            {
                ans=Integer.min(ans,val[2]-val[1]+1);
            }
        }
        return ans;
    }
}
