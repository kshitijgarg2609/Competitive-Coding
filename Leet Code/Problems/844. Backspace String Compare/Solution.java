class Solution
{
    public boolean backspaceCompare(String s, String t)
    {
        for(int i=s.length()-1,j=t.length()-1,k=0;i>=0 || j>=0;i--,j--)
        {
            for(k=0;i>=0 && (s.charAt(i)=='#' || k>0);k=(s.charAt(i--)=='#')?(k+1):(k-1));
            for(k=0;j>=0 && (t.charAt(j)=='#' || k>0);k=(t.charAt(j--)=='#')?(k+1):(k-1));
            if((i>=0 != j>=0) || (i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)))
            {
                return false;
            }
        }
        return true;
    }
}
