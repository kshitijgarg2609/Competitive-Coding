class Solution
{
    public int minimumRecolors(String blocks, int k)
    {
        int min=0;
        for(int i=0,j=0,bw[] = new int[2];i<blocks.length();i++)
        {
            bw[(blocks.charAt(i)=='B'?0:1)]++;
            if(i<k)
            {
                min=bw[1];
            }
            else
            {
                bw[(blocks.charAt(j++)=='B'?0:1)]--;
                min=Integer.min(min,bw[1]);
            }
        }
        return min;
    }
}
