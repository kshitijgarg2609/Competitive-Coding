class Solution
{
    public int maxDepth(String s)
    {
      int cnt=0;
      int max=0;
      for(char c : s.toCharArray())
      {
        cnt=(c=='(')?(cnt+1):((c==')')?(cnt-1):cnt);
        max=Integer.max(cnt,max);
      }
      return max;
    }
}
