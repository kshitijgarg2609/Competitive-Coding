class Solution
{
    public List<Integer> luckyNumbers (int[][] matrix)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list = new LinkedList<>();
        int min[] = Collections.nCopies(m,Integer.MAX_VALUE).stream().mapToInt(Integer::intValue).toArray();
        int max[] = Collections.nCopies(n,Integer.MIN_VALUE).stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                min[i]=Integer.min(min[i],matrix[i][j]);
                max[j]=Integer.max(max[j],matrix[i][j]);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(min[i]==max[j])
                {
                    list.add(min[i]);
                }
            }
        }
        return list;
    }
}
