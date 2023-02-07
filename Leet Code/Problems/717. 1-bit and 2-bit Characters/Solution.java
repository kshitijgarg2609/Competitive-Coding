class Solution
{
    public boolean isOneBitCharacter(int[] bits)
    {
        boolean flg=true;
        for(int i=0;i<bits.length;i++)
        {
            switch(bits[i])
            {
                case 0:
                {
                    flg=true;
                    break;
                }
                case 1:
                {
                    flg=false;
                    i++;
                    break;
                }
            }
        }
        return flg;
    }
}
