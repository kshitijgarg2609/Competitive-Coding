class Solution
{
    public boolean winnerOfGame(String colors)
    {
        int choice[] = new int[2];
        for(int i=0;i<colors.length();i++)
        {
            char ch=colors.charAt(i);
            int cnt=1;
            for(;i+1<colors.length() && ch==colors.charAt(i+1);i++,cnt++);
            choice[ch-'A']+=((cnt>2)?(cnt-2):0);
        }
        return choice[0]>choice[1];
    }
}
