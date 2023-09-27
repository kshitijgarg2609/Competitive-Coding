class Solution
{
    public String decodeAtIndex(String s, int k)
    {
        long total_length=0;
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                total_length*=c-'0';
            }
            else
            {
                total_length++;
            }
        }
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                total_length/=s.charAt(i)-'0';
                k%=total_length;
            }
            else
            {
                if(k==0 || k==total_length)
                {
                    str+=s.charAt(i);
                    break;
                }
                total_length--;
            }
        }
        return str;
    }
}
