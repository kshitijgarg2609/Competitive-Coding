class Solution
{
    public int[][] insert(int[][] intervals, int[] newInterval)
    {
        List<int[]> list = new ArrayList<>(){{Arrays.stream(intervals).forEach(i->add(i));}};
        int indx = Collections.binarySearch(list,newInterval,(a,b)->(a[0]!=b[0])?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        indx=(indx>=0)?indx:(-indx-1);
        list.add(indx,newInterval);
        for(int i=0;i+1<list.size();i++)
        {
            int current[] = list.get(i);
            int nxt[] = list.get(i+1);
            if(current[1]>=nxt[0] || current[1]>=nxt[1])
            {
                current[1]=Integer.max(current[1],nxt[1]);
                list.remove(i--+1);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
