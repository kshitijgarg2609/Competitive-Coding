class Solution
{
    public int numSpecial(int[][] mat)
    {
        int r=mat.length;
        int c=mat[0].length;
        int cnt=0;
        for(int row[] : mat)
        {
            int sum=0;
            int indx=-1;
            for(int i=0;i<c;i++)
            {
                if(indx==-1 && row[i]==1)
                {
                    indx=i;
                }
                sum+=row[i];
            }
            if(sum==1)
            {
                sum=0;
                for(int i=0;i<r;i++)
                {
                    sum+=mat[i][indx];
                }
                if(sum==1)
                {
                    cnt++;
                }
                if(cnt==Integer.min(r,c))
                {
                    break;
                }
            }
        }
        return cnt;
    }
}
