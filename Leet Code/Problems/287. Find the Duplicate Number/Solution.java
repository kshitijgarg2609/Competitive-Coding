class Solution
{
    public int findDuplicate(int[] nums)
    {
        int slo=nums[0],fst=nums[0];
        do
        {
            slo=nums[slo];
            fst=nums[nums[fst]];
        }
        while(slo!=fst);
        for(fst=nums[0];slo!=fst;slo=nums[slo],fst=nums[fst]);
        return fst;
    }
}
