class Solution
{
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int indx=0;
        for(int x : Arrays.stream(nums).sorted().toArray())
        {
            if(!map.containsKey(x))
            {
                map.put(x,indx);
            }
            indx++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}
