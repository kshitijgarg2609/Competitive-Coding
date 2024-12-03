class Solution
{
    public String addSpaces(String s, int[] spaces)
    {
        char arr[] = new char[s.length()+spaces.length];
        for(int indx=0,i=0,sp=0;indx<arr.length;)
        {
            if(sp<spaces.length && spaces[sp]==i)
            {
                arr[indx++]=' ';
                sp++;
            }
            if(i<s.length())
            {
                arr[indx++]=s.charAt(i++);
            }
        }
        return new String(arr);
    }
}
