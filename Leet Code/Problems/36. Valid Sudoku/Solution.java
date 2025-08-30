class Solution
{
    public boolean isValidSudoku(char[][] board)
    {
        boolean vis[] = new boolean[10];
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                Arrays.fill(vis,false);
                for(int k=0;k<9;k++)
                {
                    if(board[i+(k/3)][j+(k%3)]!='.')
                    {
                        if(vis[board[i+(k/3)][j+(k%3)]-'0'])
                        {
                            return false;
                        }
                        vis[board[i+(k/3)][j+(k%3)]-'0']=true;
                    }
                }
            }
        }
        for(int i=0;i<9;i++)
        {
            Arrays.fill(vis,false);
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(vis[board[i][j]-'0'])
                    {
                        return false;
                    }
                    vis[board[i][j]-'0']=true;
                }
            }
        }
        for(int j=0;j<9;j++)
        {
            Arrays.fill(vis,false);
            for(int i=0;i<9;i++)
            {
                if(board[i][j]!='.')
                {
                    if(vis[board[i][j]-'0'])
                    {
                        return false;
                    }
                    vis[board[i][j]-'0']=true;
                }
            }
        }
        return true;
    }
}
