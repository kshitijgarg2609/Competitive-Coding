class Solution
{
    public int removeCoveredIntervals(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?Integer.compare(a[0],b[0]):Integer.compare(b[1],a[1]));
        int cnt=0,max=0;
        for(int arr[] : intervals)
        {
            if(arr[1]>max)
            {
                max=arr[1];
                cnt++;
            }
        }
        return cnt;
    }
}
