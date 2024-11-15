class Solution
{
    public int findLengthOfShortestSubarray(int[] arr)
    {
        int ans=arr.length-1;
        for(;ans>0 && arr[ans-1]<=arr[ans];ans--);
        for(int l=0,r=ans;l<r && (l==0 || arr[l-1]<=arr[l]);ans=Integer.min(ans,r-l++-1))
        {
            for(;r<arr.length && arr[l]>arr[r];r++);
        }
        return ans;
    }
}
