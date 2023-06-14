class Solution
{
    public boolean lemonadeChange(int[] bills)
    {
        int five=0,ten=0;
        for(int a : bills)
        {
            if(a==5)
            {
                five++;
            }
            else if(a==10 && five>0)
            {
                ten++;
                five--;
            }
            else if(a==20 && ten>0 && five>0)
            {
                five--;
                ten--;
            }
            else if(a==20 && five>=3)
            {
                five-=3;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
