class Solution
{
    public List<Integer> countSmaller(int[] nums)
    {
        List<Integer> list = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        for(int i=0;i<nums.length;i++)
        {
            for(int left=0,right=list.size()-1,target=nums[i];left<=right;)
            {
                int mid=(left+right)/2;
                if(list.get(mid)==target)
                {
                    nums[i]=mid;
                }
                if(list.get(mid)<target)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            list.remove(nums[i]);
        }
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
}
