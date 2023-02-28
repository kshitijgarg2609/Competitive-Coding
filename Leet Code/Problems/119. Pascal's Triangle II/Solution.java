class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
        long arr[] = new long[rowIndex+1];
        for(int r=0;r<=arr.length/2;r++)
        {
            long n=rowIndex;
            int times=Integer.min(r,(int)(n-r));
            arr[r]=1;
            for(int i=1;i<=times;i++,n--)
            {
                if(n%i==0)
                {
                    arr[r]*=(n/i);
                }
                else if(arr[r]%i==0)
                {
                    arr[r]=(arr[r]/i)*n;
                }
                else
                {
                    arr[r]=(arr[r]*n)/i;
                }
            }
            arr[arr.length-r-1]=arr[r];
        }
        return Arrays.stream(arr).mapToInt(x->(int)x).boxed().collect(Collectors.toList());
    }
}
