class Solution
{
    public List<Integer> countSmaller(int[] nums)
    {
        List<Integer> list = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        for(int i=0;i<nums.length;i++)
        {
            int left=-1;
            int right=list.size()-1;
            while((right-left)>1)
            {
                int mid=(left+right+1)/2;
                if(nums[i]<=list.get(mid))
                {
                    right=mid;
                }
                else
                {
                    left=mid;
                }
            }
            nums[i]=right;
            list.remove(right);
        }
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
}
