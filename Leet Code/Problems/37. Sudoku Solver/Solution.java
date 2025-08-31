class Solution
{
    public void solveSudoku(char[][] board)
    {
        boolean row[][] = new boolean[9][10];
        boolean col[][] = new boolean[9][10];
        boolean box[][][] = new boolean[3][3][10];
        Deque<int[]> dq = new LinkedList<>();
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    dq.addLast(new int[]{i,j});
                }
                else
                {
                    row[i][board[i][j]-'0']=col[j][board[i][j]-'0']=box[i/3][j/3][board[i][j]-'0']=true;
                }
            }
        }
        while(!dq.isEmpty())
        {
            int i=dq.peekFirst()[0],j=dq.peekFirst()[1];
            char c=board[i][j];
            if(c=='.')
            {
                c='1';
            }
            else
            {
                row[i][c-'0']=col[j][c-'0']=box[i/3][j/3][c-'0']=false;
                c=(char)(c+1);
            }
            for(board[i][j]='.';c<='9';c=(char)(c+1))
            {
                if(!row[i][c-'0'] && !col[j][c-'0'] && !box[i/3][j/3][c-'0'])
                {
                    board[i][j]=c;
                    row[i][c-'0']=col[j][c-'0']=box[i/3][j/3][c-'0']=true;
                    stack.push(dq.remove());
                    break;
                }
            }
            if(board[i][j]=='.')
            {
                dq.addFirst(stack.pop());
            }
        }
    }
}
