class Solution
{
    public int totalNumbers(int[] digits)
    {
        int cnt=0;
        boolean vis[] = new boolean[1000];
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]%2!=0) continue;
            for(int j=0;j<digits.length;j++)
            {
                if(i==j) continue;
                for(int k=0;k<digits.length;k++)
                {
                    int num=(100*digits[k])+(10*digits[j])+digits[i];
                    if(j==k || k==i || num<100 || vis[num]) continue;
                    vis[num]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
