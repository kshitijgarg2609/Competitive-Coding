class Solution
{
    public List<Boolean> prefixesDivBy5(int[] nums)
    {
        List<Boolean> list = new ArrayList<>(nums.length);
        long cnt=0;
        for(int n : nums)
        {
            cnt=((cnt<<1)+n)%5;
            list.add(cnt==0);
        }
        return list;
    }
}
