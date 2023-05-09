class Solution
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        int dir[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int d=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        boolean vis[][] = new boolean[r][c];
        for(int k=1;k<=(r*c);k++)
        {
            list.add(matrix[i][j]);
            vis[i][j]=true;
            if((i+dir[d][0])>=0 && (i+dir[d][0])<r && (j+dir[d][1])>=0 && (j+dir[d][1])<c && !vis[i+dir[d][0]][j+dir[d][1]])
            {
                i+=dir[d][0];
                j+=dir[d][1];
            }
            else
            {
                d=(d+1)%4;
                i+=dir[d][0];
                j+=dir[d][1];
            }
        }
        return list;
    }
}
