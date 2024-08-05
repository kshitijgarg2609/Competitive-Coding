class Solution
{
    public String kthDistinct(String[] arr, int k)
    {
        String distinct = "";
        Map<String,Integer> map = new HashMap<>();
        for(String str : arr)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str : arr)
        {
            if(map.get(str)==1 && --k==0)
            {
                distinct=str;
                break;
            }
        }
        return distinct;
    }
}
