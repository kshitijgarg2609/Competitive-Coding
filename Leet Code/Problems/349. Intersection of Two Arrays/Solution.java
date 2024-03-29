class Solution
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).distinct().filter(set::contains).toArray();
    }
}
