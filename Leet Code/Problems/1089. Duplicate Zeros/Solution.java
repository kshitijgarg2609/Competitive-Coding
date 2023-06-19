class Solution
{
    public void duplicateZeros(int[] arr)
    {
        int zeros=Arrays.stream(arr).filter(x->x==0).toArray().length;
        int i,j;
        for(i=arr.length-1,j=arr.length+zeros-1;i!=j;i--)
        {
            if(j<arr.length)
            {
                arr[j]=arr[i];
            }
            j--;
            if(arr[i]==0)
            {
                if(j<arr.length)
                {
                    arr[j]=0;
                }
                j--;
            }
        }
    }
}
