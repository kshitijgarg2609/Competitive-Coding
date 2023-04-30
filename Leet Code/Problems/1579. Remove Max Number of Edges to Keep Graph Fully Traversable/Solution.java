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
    public int maxNumEdgesToRemove(int n, int[][] edges)
    {
        DisjointSetUnion alice = new DisjointSetUnion(n+1);
        DisjointSetUnion bob = new DisjointSetUnion(n+1);
        Arrays.sort(edges,(a,b)->Integer.compare(b[0],a[0]));
        int alice_edges=0;
        int bob_edges=0;
        int removed_edges=0;
        for(int edge[] : edges)
        {
            switch(edge[0])
            {
                case 3:
                {
                    if(alice.union(edge[1],edge[2]))
                    {
                        bob.union(edge[1],edge[2]);
                        alice_edges++;
                        bob_edges++;
                    }
                    else
                    {
                        removed_edges++;
                    }
                    break;
                }
                case 2:
                {
                    if(bob.union(edge[1],edge[2]))
                    {
                        bob_edges++;
                    }
                    else
                    {
                        removed_edges++;
                    }
                    break;
                }
                case 1:
                {
                    if(alice.union(edge[1],edge[2]))
                    {
                        alice_edges++;
                    }
                    else
                    {
                        removed_edges++;
                    }
                    break;
                }
            }
        }
        return (alice_edges==n-1 && bob_edges==n-1)?removed_edges:-1;
    }
}
