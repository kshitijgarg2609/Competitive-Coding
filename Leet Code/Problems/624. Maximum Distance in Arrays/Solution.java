class Solution
{
    public int maxDistance(List<List<Integer>> arrays)
    {
        int min=arrays.get(0).getFirst();
        int max=arrays.get(0).getLast();
        int distance=0;
        for(int i=1;i<arrays.size();i++)
        {
            distance=Integer.max(distance,Integer.max(Math.abs(min-arrays.get(i).getLast()),Math.abs(max-arrays.get(i).getFirst())));
            min=Integer.min(min,arrays.get(i).getFirst());
            max=Integer.max(max,arrays.get(i).getLast());
        }
        return distance;
    }
}
