class Solution
{
    public int[] findEvenNumbers(int[] digits)
    {
        int cnt[] = new int[10];
        Arrays.stream(digits).forEach(d->cnt[d]++);
        return IntStream.range(100,1000).filter(i->i%2==0).filter(i->{
            int cntd[] = new int[10];
            for(int j=i;j>0;cntd[j%10]++,j/=10);
            return IntStream.range(0,10).filter(j->cntd[j]!=0 && cntd[j]<=cnt[j]).map(j->cntd[j]).sum()==3;
        }).toArray();
    }
}
