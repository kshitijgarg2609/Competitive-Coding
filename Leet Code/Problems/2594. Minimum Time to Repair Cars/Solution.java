class Solution
{
    public long repairCars(int[] ranks, int cars)
    {
        long snp=0L;
        for(long l=0L,r=1L*cars*cars*Arrays.stream(ranks).min().getAsInt();l<=r;)
        {
            long mid=(l+r)/2;
            long cnt=Arrays.stream(ranks).mapToLong(v->(long)Math.floor(Math.sqrt(((double)mid)/v))).sum();
            if(cnt>=cars)
            {
                snp=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return snp;
    }
}
