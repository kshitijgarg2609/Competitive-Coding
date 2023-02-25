class Solution
{
    public int minDeletionSize(String[] strs)
    {
        int len=strs[0].length();
        int cnt[] = new int[len];
        for(int i=1;i<strs.length;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(cnt[j]==0 && strs[i].charAt(j)<strs[i-1].charAt(j))
                {
                    cnt[j]=1;
                }
            }
        }
        return (int)Arrays.stream(cnt).filter(x->x==1).count();
    }
}
