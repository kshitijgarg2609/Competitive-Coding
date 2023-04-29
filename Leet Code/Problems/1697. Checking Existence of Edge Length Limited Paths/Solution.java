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
        void union(int u,int v)
        {
            u=find(u);
            v=find(v);
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
        }
    }
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries)
    {
        DisjointSetUnion dsu = new DisjointSetUnion(n);
        Arrays.sort(edgeList,(a,b)->Integer.compare(a[2],b[2]));
        List<List<Integer>> qu = new ArrayList<>();
        IntStream.range(0,queries.length).forEach(x->qu.add(Arrays.asList(queries[x][0],queries[x][1],queries[x][2],x)));
        Collections.sort(qu,(a,b)->Integer.compare(a.get(2),b.get(2)));
        boolean ans[] = new boolean[queries.length];
        int j=0;
        for(List<Integer> q : qu)
        {
            while(j<edgeList.length && edgeList[j][2]<q.get(2).intValue())
            {
                dsu.union(edgeList[j][0],edgeList[j][1]);
                j++;
            }
            ans[q.get(3)]=dsu.find(q.get(0))==dsu.find(q.get(1));
        }
        return ans;
    }
}
