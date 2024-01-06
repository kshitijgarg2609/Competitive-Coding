class Solution
{
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit)
    {
        java.util.NavigableMap<Integer,Integer> map = new TreeMap<>(){{put(0,0);}};
        IntStream.range(0,startTime.length).mapToObj(i->new int[]{startTime[i],endTime[i],profit[i]}).sorted((a,b)->Integer.compare(a[1],b[1])).forEach(job->map.put(job[1],Integer.max(map.floorEntry(job[0]).getValue()+job[2],map.floorEntry(job[1]).getValue())));
        return map.lastEntry().getValue();
    }
}
