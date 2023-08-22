class Solution
{
    public String convertToTitle(int columnNumber)
    {
        StringBuilder sb = new StringBuilder(); 
        int n=columnNumber;
        while(n>0)
        {
            n--;
            sb.append((char)((n%26)+'A'));
            n/=26;
        }
        return sb.reverse().toString();
    }
}
