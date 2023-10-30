class Solution
{
    public void solveSudoku(char[][] board)
    {
        List<int[]> blank = new ArrayList<>();
        boolean row[][] = new boolean[9][9];
        boolean col[][] = new boolean[9][9];
        boolean block[][] = new boolean[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    blank.add(new int[]{i,j});
                    continue;
                }
                row[i][board[i][j]-'0'-1]=col[j][board[i][j]-'0'-1]=block[3*(i/3)+(j/3)][board[i][j]-'0'-1]=true;
            }
        }
        for(int k=0;k<blank.size();)
        {
            int start=1,i=blank.get(k)[0],j=blank.get(k)[1];
            if(board[i][j]!='.')
            {
                start=board[i][j]-'0'+1;
                row[i][board[i][j]-'0'-1]=col[j][board[i][j]-'0'-1]=block[3*(i/3)+(j/3)][board[i][j]-'0'-1]=false;
                board[i][j]='.';
            }
            for(;start<=9;start++)
            {
                if(!row[i][start-1] && !col[j][start-1] && !block[3*(i/3)+(j/3)][start-1])
                {
                    row[i][start-1]=col[j][start-1]=block[3*(i/3)+(j/3)][start-1]=true;
                    board[i][j]=(char)(start+'0');
                    k++;
                    break;
                }
            }
            if(board[i][j]=='.')
            {
                k--;
            }
        }
    }
}
