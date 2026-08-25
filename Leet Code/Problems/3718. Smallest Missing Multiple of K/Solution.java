class Solution
{
    public int missingMultiple(int[] nums, int k)
    {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(n->set.add(n));
        int m=1;
        for(;set.contains(m*k);m++);
        return m*k;
    }
}
