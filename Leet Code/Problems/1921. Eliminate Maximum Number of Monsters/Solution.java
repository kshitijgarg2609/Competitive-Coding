class Solution
{
    public int eliminateMaximum(int[] dist, int[] speed)
    {
        double time[] = IntStream.range(0,dist.length).mapToDouble(i->(double)dist[i]/speed[i]).sorted().toArray();
        int monster=0;
        for(int i=0;i<dist.length && time[i]>i++;monster++);
        return monster;
    }
}
