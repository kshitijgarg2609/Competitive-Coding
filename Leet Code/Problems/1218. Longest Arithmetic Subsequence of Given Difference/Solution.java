class Solution
{
    public int longestSubsequence(int[] arr, int difference)
    {
        int max=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : arr)
        {
            map.put(x,map.getOrDefault(x-difference,0)+1);
            max=Integer.max(max,map.get(x));
        }
        return max;
    }
}
