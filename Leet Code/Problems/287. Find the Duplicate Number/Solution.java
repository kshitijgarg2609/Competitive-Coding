class Solution
{
    public int findDuplicate(int[] nums)
    {
        int slo=nums[nums[0]],fst=nums[nums[nums[0]]];
        for(;slo!=fst;slo=nums[slo],fst=nums[nums[fst]]);
        for(fst=nums[0];slo!=fst;slo=nums[slo],fst=nums[fst]);
        return fst;
    }
}
