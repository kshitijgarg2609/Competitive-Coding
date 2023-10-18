class Solution
{
    public int minOperations(int[] nums)
    {
        int arr[] = Arrays.stream(nums).distinct().sorted().toArray();
        int cnt = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int indx = Arrays.binarySearch(arr,arr[i]+nums.length-1);
            indx=(indx>=0)?indx:(Math.abs(indx)-1);
            indx=(indx<arr.length && arr[indx]==(arr[i]+nums.length-1))?(indx+1):indx;
            cnt=Integer.min(cnt,nums.length-(indx-i));
        }
        return cnt;
    }
}
