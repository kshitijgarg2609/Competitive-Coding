class Solution
{
    public String generateTheString(int n)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++)
        {
            sb.append('a');
        }
        if(n%2==0)
        {
            sb.deleteCharAt(n-1);
            sb.append('b');
        }
        return sb.toString();
    }
}
