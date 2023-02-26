class Solution
{
    public int[] arrayRankTransform(int[] arr)
    {
        int ranked_arr[] = Arrays.stream(arr).distinct().sorted().toArray();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Arrays.binarySearch(ranked_arr,arr[i])+1;
        }
        return arr;
    }
}
