class Solution
{
    public int minLength(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        minLength(sb);
        return sb.length();
    }
    public void minLength(StringBuilder sb)
    {
        int indx=-1;
        if((indx=sb.indexOf("AB"))!=-1 || (indx=sb.indexOf("CD"))!=-1)
        {
            sb.delete(indx,indx+2);
            minLength(sb);
        }
    }
}
