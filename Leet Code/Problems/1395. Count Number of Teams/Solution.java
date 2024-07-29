class Solution
{
    public int numTeams(int[] rating)
    {
        int cnt=0;
        for(int i=1;i<rating.length-1;i++)
        {
            int leftSmall=0,leftGreater=0,rightSmall=0,rightGreater=0;
            for(int j=0;j<rating.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(j<i)
                {
                    if(rating[j]<rating[i])
                    {
                        leftSmall++;
                    }
                    else
                    {
                        leftGreater++;
                    }
                }
                else
                {
                    if(rating[j]<rating[i])
                    {
                        rightSmall++;
                    }
                    else
                    {
                        rightGreater++;
                    }
                }
            }
            cnt+=(leftSmall*rightGreater)+(leftGreater*rightSmall);
        }
        return cnt;
    }
}
