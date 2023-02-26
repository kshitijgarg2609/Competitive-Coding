class Solution
{
    public String tictactoe(int[][] moves)
    {
        int t[][] = new int[3][3];
        int A_count=0;
        int B_count=0;
        boolean flg=true;
        for(int m[] : moves)
        {
            t[m[0]][m[1]]=(flg)?'A':'B';
            if(flg)
            {
                A_count++;
                flg=false;
            }
            else
            {
                B_count++;
                flg=true;
            }
        }
        for(int i=0;i<3;i++)
        {
            if(t[0][i]!=0 && t[0][i]==t[1][i] && t[1][i]==t[2][i])
            {
                return String.valueOf((char)(t[0][i]));
            }
            if(t[i][0]!=0 && t[i][0]==t[i][1] && t[i][1]==t[i][2])
            {
                return String.valueOf((char)(t[i][0]));
            }
        }
        if(t[1][1]!=0 && ((t[0][0]==t[1][1] && t[1][1]==t[2][2])||(t[0][2]==t[1][1] && t[1][1]==t[2][0])))
        {
            return String.valueOf((char)(t[1][1]));
        }
        if((A_count+B_count)==9)
        {
            return "Draw";
        }
        return "Pending";
    }
}
