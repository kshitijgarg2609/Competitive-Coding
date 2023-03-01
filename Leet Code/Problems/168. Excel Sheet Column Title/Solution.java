class Solution
{
    public String convertToTitle(int columnNumber)
    {
        StringBuilder sb = new StringBuilder(); 
        int n=columnNumber;
        while(n>0)
        {
            char c=(n%26==0)?'Z':(char)((n%26)-1+'A');
            sb.append(c);
            System.out.println(n%26);
            n=(n-(c-'A'))/26;
        }
        return sb.reverse().toString();
    }
}
