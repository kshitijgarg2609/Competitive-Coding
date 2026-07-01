class Solution
{
    public int numberOfSubstrings(String s)
    {
        int cnt=0;
        int indx[] = new int[]{-1,-1,-1};
        for(int i=0;i<s.length();i++)
        {
            indx[s.charAt(i)-'a']=i;
            cnt+=1+Arrays.stream(indx).min().getAsInt();
        }
        return cnt;
    }
}
