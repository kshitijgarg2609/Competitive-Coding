class Solution
{
    public int[] fullBloomFlowers(int[][] flowers, int[] people)
    {
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        for(int flower[] : flowers)
        {
            start.add(flower[0]);
            end.add(flower[1]+1);
        }
        Collections.sort(start);
        Collections.sort(end);
        Map<Integer,Integer> map = new HashMap<>();
        for(int p : people)
        {
            map.putIfAbsent(p,0);
        }
        for(Map.Entry<Integer,Integer> ent : map.entrySet())
        {
            int i=Collections.binarySearch(start,ent.getKey(),(a,b)->((a.intValue()!=b.intValue())?Integer.compare(a,b):-1));
            int j=Collections.binarySearch(end,ent.getKey(),(a,b)->((a.intValue()!=b.intValue())?Integer.compare(a,b):-1));
            ent.setValue(Math.abs(i-j));
        }
        return Arrays.stream(people).map(p->map.get(p)).toArray();
    }
}
