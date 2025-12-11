class Solution
{
    public int countCoveredBuildings(int n, int[][] buildings)
    {
        int cnt=0;
        Map<Integer,int[]> xMap = new HashMap<>();
        Map<Integer,int[]> yMap = new HashMap<>();
        for(int b[] : buildings)
        {
            int y[] = xMap.computeIfAbsent(b[0],k->new int[]{n,0});
            y[0]=Integer.min(y[0],b[1]);
            y[1]=Integer.max(y[1],b[1]);
            int x[] = yMap.computeIfAbsent(b[1],k->new int[]{n,0});
            x[0]=Integer.min(x[0],b[0]);
            x[1]=Integer.max(x[1],b[0]);
        }
        for(int b[] : buildings)
        {
            int y[] = xMap.get(b[0]);
            int x[] = yMap.get(b[1]);
            if(b[0]>x[0] && b[0]<x[1] && b[1]>y[0] && b[1]<y[1])
            {
                cnt++;
            }
        }
        return cnt;
    }
}
