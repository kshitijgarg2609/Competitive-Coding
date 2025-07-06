class FindSumPairs
{
    int nums1[];
    int nums2[];
    Map<Integer,Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2)
    {
        this.nums1=nums1;
        this.nums2=nums2;
        Arrays.stream(nums2).forEach(num->map.put(num,map.getOrDefault(num,0)+1));
    }
    public void add(int index, int val)
    {
        if(map.get(nums2[index])==1)
        {
            map.remove(nums2[index]);
        }
        else
        {
            map.put(nums2[index],map.get(nums2[index])-1);
        }
        map.put(nums2[index]+=val,map.getOrDefault(nums2[index],0)+1);
    }
    public int count(int tot)
    {
        return Arrays.stream(nums1).map(num->map.getOrDefault(tot-num,0)).sum();
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
