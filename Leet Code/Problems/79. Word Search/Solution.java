class Solution
{
    public boolean exist(char[][] board, String word)
    {
        int m=board.length,n=board[0].length;
        int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0) && exist(board,word,0,new int[]{i,j},new boolean[m][n]))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word,int i,int pos[],boolean vis[][])
    {
        int m=board.length,n=board[0].length;
        if(board[pos[0]][pos[1]]==word.charAt(i))
        {
            vis[pos[0]][pos[1]]=true;
            if(++i==word.length())
            {
                return true;
            }
            for(int d[] : new int[][]{{0,1},{0,-1},{1,0},{-1,0}})
            {
                int nxt[] = new int[]{pos[0]+d[0],pos[1]+d[1]};
                if(nxt[0]>=0 && nxt[0]<m && nxt[1]>=0 && nxt[1]<n && !vis[nxt[0]][nxt[1]] && exist(board,word,i,nxt,vis))
                {
                    return true;
                }
            }
            vis[pos[0]][pos[1]]=false;
        }
        return false;
    }
}
