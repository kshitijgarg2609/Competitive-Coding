class Solution
{
    public int peakIndexInMountainArray(int[] arr)
    {
        int mid=0;
        for(int left=0,right=arr.length-1;left<=right;)
        {
            mid=(left+right)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
            {
                left=mid;
            }
            else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
            {
                right=mid;
            }
            else
            {
                break;
            }
        }
        return mid;
    }
}
