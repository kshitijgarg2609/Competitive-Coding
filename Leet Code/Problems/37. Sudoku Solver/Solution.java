class Solution
{
    public void solveSudoku(char[][] board)
    {
        List<List<Integer>> fill = new ArrayList<>();
        boolean row[][] = new boolean[9][9];
        boolean col[][] = new boolean[9][9];
        boolean block[][] = new boolean[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    fill.add(Arrays.asList(i,j));
                    continue;
                }
                row[i][board[i][j]-'0'-1]=true;
                col[j][board[i][j]-'0'-1]=true;
                block[(3*(i/3))+(j/3)][board[i][j]-'0'-1]=true;
            }
        }
        int i=0;
        while(i<fill.size())
        {
            List<Integer> crd = fill.get(i);
            int block_indx = (3*(crd.get(0)/3))+(crd.get(1)/3);
            char ch=board[crd.get(0)][crd.get(1)];
            if(ch!='.')
            {
                row[crd.get(0)][ch-'0'-1]=false;
                col[crd.get(1)][ch-'0'-1]=false;
                block[block_indx][ch-'0'-1]=false;
            }
            if(ch=='9')
            {
                board[crd.get(0)][crd.get(1)]='.';
                i--;
                continue;
            }
            else if(ch=='.')
            {
                ch='1';
            }
            else
            {
                ch=(char)(ch+1);
            }
            boolean flg=true;
            for(char c=ch;flg && c<='9';c=(char)(c+1))
            {
                if(!row[crd.get(0)][c-'0'-1] && !col[crd.get(1)][c-'0'-1] && !block[block_indx][c-'0'-1])
                {
                    board[crd.get(0)][crd.get(1)]=c;
                    row[crd.get(0)][c-'0'-1]=true;
                    col[crd.get(1)][c-'0'-1]=true;
                    block[block_indx][c-'0'-1]=true;
                    i++;
                    flg=false;
                }
            }
            if(flg)
            {
                board[crd.get(0)][crd.get(1)]='.';
                i--;
            }
        }
    }
}
