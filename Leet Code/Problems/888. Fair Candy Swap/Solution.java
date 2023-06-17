class Solution
{
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes)
    {
        int sum_alice = Arrays.stream(aliceSizes).sum();
        int sum_bob = Arrays.stream(bobSizes).sum();
        int ex=(sum_bob-sum_alice)/2;
        Set<Integer> set = Arrays.stream(bobSizes).boxed().collect(Collectors.toSet());
        int ans[] = new int[2];
        for(int x : aliceSizes)
        {
            if(set.contains(x+ex))
            {
                ans[0]=x;
                ans[1]=x+ex;
                break;
            }
        }
        return ans;
    }
}
