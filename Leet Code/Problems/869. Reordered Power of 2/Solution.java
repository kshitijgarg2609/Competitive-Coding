class Solution
{
    public boolean reorderedPowerOf2(int n)
    {
        for(int i=0;i<32;i++)
        {
            int arr[] = new int[10];
            for(int j=n;j>0;arr[j%10]++,j/=10);
            for(int j=(int)(Math.pow(2,i));j>0;arr[j%10]--,j/=10);
            if(Arrays.stream(arr).filter(e->e!=0).count()==0L)
            {
                return true;
            }
        }
        return false;
    }
}
