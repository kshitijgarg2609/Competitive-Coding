class Solution
{
    class DisjointSetUnion
    {
        int node[];
        int rank[];
        DisjointSetUnion(int n)
        {
            node = IntStream.range(0,n).toArray();
            rank = new int[n];
        }
        int find(int n)
        {
            if(n==node[n])
            {
                return n;
            }
            return node[n]=find(node[n]);
        }
        boolean union(int u,int v)
        {
            u=find(u);
            v=find(v);
            if(u==v)
            {
                return false;
            }
            if(rank[u]<rank[v])
            {
                node[u]=v;
            }
            else if(rank[u]>rank[v])
            {
                node[v]=u;
            }
            else
            {
                node[v]=u;
                rank[u]++;
            }
            return true;
        }
    }
    public int minCostConnectPoints(int[][] points)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        for(int i=0;i<points.length-1;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                pq.add(new int[]{i,j,Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1])});
            }
        }
        int wt=0;
        int inc=0;
        DisjointSetUnion dsu = new DisjointSetUnion(points.length);
        while(!pq.isEmpty() && inc!=points.length-1)
        {
            int eg[] = pq.poll();
            if(dsu.union(eg[0],eg[1]))
            {
                inc++;
                wt+=eg[2];
            }
        }
        return wt;
    }
}
