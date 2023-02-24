class Solution
{
    public int[] shortestToChar(String s, char c)
    {
        int arr[] = new int[s.length()];
        int prev=0-s.length();
        int next=s.indexOf(c);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                arr[i]=0;
                prev=next;
                next=s.indexOf(c,next+1);
                next=(next!=-1)?next:(2*s.length());
            }
            else
            {
                arr[i]=Integer.min((i-prev),(next-i));
            }
        }
        return arr;
    }
}
