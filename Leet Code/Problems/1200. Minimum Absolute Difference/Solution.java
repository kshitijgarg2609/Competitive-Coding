class Solution
{
    public List<List<Integer>> minimumAbsDifference(int[] arr)
    {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-arr[i-1])<diff)
            {
                list.clear();
                diff=arr[i]-arr[i-1];
            }
            if((arr[i]-arr[i-1])==diff)
            {
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return list;
    }
}
