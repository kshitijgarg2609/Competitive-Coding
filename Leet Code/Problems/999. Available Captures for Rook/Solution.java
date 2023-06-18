class Solution
{
    public int numRookCaptures(char[][] board)
    {
        int ri=-1,rj=-1;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                    ri=i;
                    rj=j;
                    break;
                }
            }
        }
        int ans=0;
        for(int d[] : new int[][]{{-1,0},{1,0},{0,1},{0,-1}})
        {
            int pnt[] = new int[]{ri+d[0],rj+d[1]};
            while(pnt[0]>=0 && pnt[0]<8 && pnt[1]>=0 && pnt[1]<8)
            {
                if(board[pnt[0]][pnt[1]]=='B')
                {
                    break;
                }
                else if(board[pnt[0]][pnt[1]]=='p')
                {
                    ans++;
                    break;
                }
                pnt[0]+=d[0];
                pnt[1]+=d[1];
            }
        }
        return ans;
    }
}
