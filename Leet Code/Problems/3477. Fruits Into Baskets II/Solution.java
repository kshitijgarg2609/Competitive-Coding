class Solution
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets)
    {
        return (int)(Arrays.stream(fruits).filter(f->{
            for(int i=0;i<baskets.length;i++)
            {
                if(baskets[i]!=Integer.MAX_VALUE && f<=baskets[i])
                {
                    baskets[i]=Integer.MAX_VALUE;
                    return false;
                }
            }
            return true;
        }).count());
    }
}
