class Solution
{
    public int minSwaps(int[][] grid)
    {
        int indx[] = Arrays.stream(grid).mapToInt(r->IntStream.range(0,r.length).filter(i->r[i]==1).max().orElse(-1)).toArray();
        int cnt=0;
        for(int i=0,j=0;i<indx.length;i++)
        {
            for(j=i;j<indx.length && i<indx[j];j++);
            if(j==indx.length)
            {
                return -1;
            }
            for(;j>i;j--,cnt++)
            {
                int tmp=indx[j];
                indx[j]=indx[j-1];
                indx[j-1]=tmp;
            }
        }
        return cnt;
    }
}
