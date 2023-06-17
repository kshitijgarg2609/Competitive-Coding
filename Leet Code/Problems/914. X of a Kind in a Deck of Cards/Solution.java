class Solution
{
    public boolean hasGroupsSizeX(int[] deck)
    {
        Iterator<Integer> it=Arrays.stream(deck).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().map(Map.Entry::getValue).mapToInt(Long::intValue).boxed().collect(Collectors.toSet()).iterator();
        int gcd=it.next();
        while(it.hasNext())
        {
            int num=it.next();
            while(gcd!=num)
            {
                if(gcd>num)
                {
                    gcd-=num;
                }
                else
                {
                    num-=gcd;
                }
            }
        }
        return gcd>1;
    }
}
