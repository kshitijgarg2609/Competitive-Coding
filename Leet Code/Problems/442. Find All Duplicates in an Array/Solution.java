class Solution
{
    public List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> list = new LinkedList<>();
        for(int num : nums)
        {
            int indx=Math.abs(num)-1;
            if(nums[indx]<0)
            {
                list.add(indx+1);
            }
            else
            {
                nums[indx]*=-1;
            }
        }
        return list;
    }
}
