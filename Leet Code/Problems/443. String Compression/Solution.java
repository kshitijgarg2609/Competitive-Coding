class Solution
{
    public int compress(char[] chars)
    {
        int len=0;
        for(int i=0;i<chars.length;)
        {
            char fix=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==fix)
            {
                cnt++;
                i++;
            }
            chars[len++]=fix;
            if(cnt>1)
            {
                for(char c : String.valueOf(cnt).toCharArray())
                {
                    chars[len++]=c;
                }
            }
        }
        return len;
    }
}
