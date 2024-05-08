class Solution
{
    public String[] findRelativeRanks(int[] score)
    {
        List<String> medals = new ArrayList<>(Arrays.asList("Gold Medal","Silver Medal","Bronze Medal"));
        SortedSet<Integer> indx = new TreeSet<>(Collections.reverseOrder(Comparator.comparing(x->score[x])));
        for(int i=0;i<score.length;indx.add(i++));
        String arr[] = new String[score.length];
        int rank=0;
        for(int x : indx)
        {
            arr[x]=(rank++<3)?medals.get(rank-1):String.valueOf(rank);
        }
        return arr;
    }
}
