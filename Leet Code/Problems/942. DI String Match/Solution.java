class Solution
{
    public int[] diStringMatch(String s)
    {
        int perm[] = new int[s.length()+1];
        int i=0,j=s.length();
        for(int k=0;k<s.length();k++)
        {
            if(s.charAt(k)=='I')
            {
                perm[k]=i++;
            }
            else
            {
                perm[k]=j--;
            }
        }
        perm[s.length()]=i;
        return perm;
    }
}
