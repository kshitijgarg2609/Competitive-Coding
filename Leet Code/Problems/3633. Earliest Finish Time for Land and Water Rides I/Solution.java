class Solution
{
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration)
    {
        return IntStream.range(0,landStartTime.length).flatMap(i->
        {
            int l[] = new int[]{landStartTime[i],landDuration[i]};
            return IntStream.range(0,waterStartTime.length).map(j->
            {
                int w[] = new int[]{waterStartTime[j],waterDuration[j]};
                return Integer.min(Integer.max(l[0]+l[1],w[0])+w[1],Integer.max(w[0]+w[1],l[0])+l[1]);
            });
        }).min().getAsInt();
    }
}
