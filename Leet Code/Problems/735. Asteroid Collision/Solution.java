class Solution
{
    public int[] asteroidCollision(int[] asteroids)
    {
        List<Integer> list = Arrays.stream(asteroids).boxed().collect(Collectors.toList());
        int i=0;
        while(i<list.size())
        {
            if(list.get(i)<0 && i>0 && list.get(i-1)>0)
            {
                if((list.get(i-1)+list.get(i))>0)
                {
                    list.remove(i);
                }
                else if((list.get(i-1)+list.get(i))<0)
                {
                    list.remove(i---1);
                }
                else
                {
                    list.remove(--i);
                    list.remove(i);
                }
            }
            else
            {
                i++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
