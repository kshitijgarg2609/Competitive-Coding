class Solution
{
    class DisjointSetUnion
    {
        int parent[],rank[];
        DisjointSetUnion(int n)
        {
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;parent[i]=i,rank[i++]=1);
        }
        int find(int x)
        {
            if(parent[x]!=x)
            {
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        void union(int x,int y)
        {
            int rootX=find(x),rootY=find(y);
            if(rootX==rootY)
            {
                return;
            }
            if(rank[rootX]>=rank[rootY])
            {
                parent[rootY]=rootX;
                if(rank[rootX]==rank[rootY])
                {
                    rank[rootX]++;
                }
            }
            else
            {
                parent[rootY]=rootX;
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination)
    {
        DisjointSetUnion dsu = new DisjointSetUnion(n);
        for(int edge[] : edges)
        {
            dsu.union(edge[0],edge[1]);
        }
        return dsu.find(source)==dsu.find(destination);
    }
}
