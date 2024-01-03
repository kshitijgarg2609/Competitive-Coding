class Solution
{
    public int numberOfBeams(String[] bank)
    {
        int cnt=0;
        for(int i=0,prev=(int)bank[i++].chars().filter(ch->ch=='1').count();i<bank.length;i++)
        {
            int next=(int)bank[i].chars().filter(ch->ch=='1').count();
            if(next>0)
            {
                cnt+=(prev*next);
                prev=next;
            }
        }
        return cnt;
    }
}
