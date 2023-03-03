class Solution
{
    public String[] findRelativeRanks(int[] score)
    {
        List<String> medals = new ArrayList<>(Arrays.asList("Gold Medal","Silver Medal","Bronze Medal"));
        SortedSet<Integer> indx = new TreeSet<>(Collections.reverseOrder(Comparator.comparing(x->score[x-1])));
        for(int i=0;i<score.length;i++)
        {
            indx.add(i+1);
        }
        String arr[] = new String[score.length];
        int cnt=1;
        for(int x : indx)
        {
            arr[x-1]=(medals.size()!=0)?medals.remove(0):Integer.valueOf(cnt).toString();
            cnt++;
        }
        return arr;
    }
}
