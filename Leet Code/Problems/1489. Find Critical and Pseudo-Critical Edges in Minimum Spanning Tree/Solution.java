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
    int minimunSpanningTree(int n,int edges[][],int indx,boolean skip)
    {
        int wt=0;
        int inc=0;
        DisjointSetUnion dsu = new DisjointSetUnion(n);
        if(!skip && dsu.union(edges[indx][0],edges[indx][1]))
        {
            wt=edges[indx][2];
            inc++;
        }
        for(int i=0;i<edges.length;i++)
        {
            if(i==indx)
            {
                continue;
            }
            if(dsu.union(edges[i][0],edges[i][1]))
            {
                wt+=edges[i][2];
                inc++;
            }
        }
        return (inc==n-1)?wt:-wt;
    }
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges)
    {
        int eg[][] = new int[edges.length][4];
        for(int i=0;i<edges.length;i++)
        {
            eg[i][0]=edges[i][0];
            eg[i][1]=edges[i][1];
            eg[i][2]=edges[i][2];
            eg[i][3]=i;
        }
        Arrays.sort(eg,(a,b)->Integer.compare(a[2],b[2]));
        int mst_wt=minimunSpanningTree(n,eg,0,false);
        List<List<Integer>> list = new LinkedList<>(){{add(new LinkedList<>());add(new LinkedList<>());}};
        for(int i=0;i<edges.length;i++)
        {
            int wt=minimunSpanningTree(n,eg,i,true);
            if(wt<=0 || wt>mst_wt)
            {
                list.get(0).add(eg[i][3]);
            }
            else if(minimunSpanningTree(n,eg,i,false)==mst_wt)
            {
                list.get(1).add(eg[i][3]);
            }
        }
        return list;
    }
}
