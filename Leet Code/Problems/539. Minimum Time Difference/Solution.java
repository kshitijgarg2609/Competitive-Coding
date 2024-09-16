class Solution
{
    public int findMinDifference(List<String> timePoints)
    {
        int arr[] = timePoints.stream().mapToInt(t->(Integer.parseInt(t.substring(0,2))*60)+Integer.parseInt(t.substring(3,5))).sorted().toArray();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            min=Integer.min(min,arr[i]-arr[i-1]);
        }
        return Integer.min(min,(24*60)-arr[arr.length-1]+arr[0]);
    }
}
