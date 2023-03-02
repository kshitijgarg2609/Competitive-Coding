class Solution
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=i+1 && nums[nums[i]-1]!=nums[i])
            {
                int tmp=nums[i];
                nums[i]=nums[tmp-1];
                nums[tmp-1]=tmp;
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(nums[i-1]!=i)
            {
                list.add(i);
            }
        }
        return list;
    }
}
