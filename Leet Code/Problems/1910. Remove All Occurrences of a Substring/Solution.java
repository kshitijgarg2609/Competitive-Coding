class Solution
{
    public String removeOccurrences(String s, String part)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int indx=-1;(indx=sb.indexOf(part))>=0;sb.delete(indx,indx+part.length()));
        return sb.toString();
    }
}
