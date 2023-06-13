class Solution
{
    public int countPrimeSetBits(int left, int right)
    {
        Set<Integer> set = IntStream.of(2,3,5,7,11,13,17,19).boxed().collect(Collectors.toSet());
        int ans=0;
        for(int i=left;i<=right;i++)
        {
            if(set.contains(Integer.bitCount(i)))
            {
                ans++;
            }
        }
        return ans;
    }
}
