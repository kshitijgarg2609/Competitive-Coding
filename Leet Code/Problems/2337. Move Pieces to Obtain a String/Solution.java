class Solution
{
    public boolean canChange(String start, String target)
    {
        int i=0,j=0,len=start.length();
        for(;i<len || j<len;i++,j++)
        {
            for(;i<len && start.charAt(i)=='_';i++);
            for(;j<len && target.charAt(j)=='_';j++);
            if(i==len && j==len)
            {
                break;
            }
            if(i<len && j<len)
            {
                char a=start.charAt(i),b=target.charAt(j);
                if(a!=b || (a=='L' && i<j) || (a=='R' && i>j))
                {
                    return false;
                }
            }
        }
        return i==len && j==len;
    }
}
