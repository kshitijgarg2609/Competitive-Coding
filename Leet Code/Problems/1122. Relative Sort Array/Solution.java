class Solution
{
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        Map<Integer,Integer> map = new HashMap<>();
        IntStream.range(0,arr2.length).forEach(i->map.put(arr2[i],i));
        return Arrays.stream(arr1).boxed().sorted((a,b)->
        {
            boolean res_a=map.containsKey(a);
            boolean res_b=map.containsKey(b);
            if(res_a && res_b)
            {
                return Integer.compare(map.get(a),map.get(b));
            }
            else if(res_a || res_b)
            {
                return res_a?-1:1;
            }
            else
            {
                return Integer.compare(a,b);
            }
        }).mapToInt(Integer::intValue).toArray();
    }
}
