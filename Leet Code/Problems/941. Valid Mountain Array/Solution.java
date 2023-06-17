class Solution
{
    public boolean validMountainArray(int[] arr)
    {
        int indx=0;
        for(;indx+1<arr.length && arr[indx]<arr[indx+1];indx++);
        if(arr.length<3 || indx==arr.length-1 ||indx==0)
        {
            return false;
        }
        for(indx++;indx<arr.length;indx++)
        {
            if(arr[indx-1]<=arr[indx])
            {
                return false;
            }
        }
        return true;
    }
}
