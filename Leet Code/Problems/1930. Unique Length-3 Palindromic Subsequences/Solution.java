class Solution
{
    public int countPalindromicSubsequence(String s)
    {
        int cnt=0;
        int indxs[][] = new int[26][2];
        for(int i=s.length()-1,j=0;i>=0;indxs[s.charAt(i)-'a'][0]=i--,indxs[s.charAt(j)-'a'][1]=j++);
        for(int indx[] : indxs)
        {
            if(indx[0]>=0 && indx[0]<indx[1])
            {
                boolean vis[] = new boolean[26];
                for(int i=indx[0]+1;i<indx[1];i++)
                {
                    if(!vis[s.charAt(i)-'a'])
                    {
                        cnt++;
                        vis[s.charAt(i)-'a']=true;
                    }
                }
            }
        }
        return cnt;
    }
}
