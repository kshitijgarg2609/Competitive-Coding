class Solution
{
    public String makeFancyString(String s)
    {
        StringBuilder sb = new StringBuilder();
        char lst='\0';
        int streak=0;
        for(char c : s.toCharArray())
        {
            if(c==lst)
            {
                streak++;
            }
            else
            {
                lst=c;
                streak=1;
            }
            if(streak<=2)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
