class Solution
{
    public boolean isLongPressedName(String name, String typed)
    {
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length())
        {
            char skip=name.charAt(i);
            int name_cnt=0;
            int typed_cnt=0;
            while(i<name.length() && skip==name.charAt(i))
            {
                name_cnt++;
                i++;
            }
            while(j<typed.length() && skip==typed.charAt(j))
            {
                typed_cnt++;
                j++;
            }
            if(name_cnt>typed_cnt)
            {
                return false;
            }
        }
        return i==name.length() && j==typed.length();
    }
}
