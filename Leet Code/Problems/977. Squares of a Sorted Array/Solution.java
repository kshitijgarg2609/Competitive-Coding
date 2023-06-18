class Solution
{
    public int[] sortedSquares(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        int indx=-1,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                list.add(nums[i]*nums[i]);
            }
            else
            {
                indx=i;
            }
        }
        i=0;
        for(;indx>=0;indx--)
        {
            for(;i<list.size() && (nums[indx]*nums[indx])>list.get(i);i++);
            list.add(i,nums[indx]*nums[indx]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
