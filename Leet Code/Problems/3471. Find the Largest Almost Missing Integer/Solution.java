class Solution
{
    public int largestInteger(int[] nums, int k)
    {
        if(nums.length==k)
        {
            return Arrays.stream(nums).max().getAsInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                continue;
            }
            else if(map.containsKey(nums[i]))
            {
                set.add(nums[i]);
                map.remove(nums[i]);
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> en : map.entrySet())
        {
            int indx[] = new int[]{Integer.max(0,en.getValue()-(k-1)),Integer.min(nums.length-1,en.getValue()+(k-1))};
            System.out.println(en+" : "+Arrays.toString(indx));
            if(indx[1]-indx[0]+1==k)
            {
                ans=Integer.max(ans,en.getKey());
            }
        }
        return ans;
    }
}
