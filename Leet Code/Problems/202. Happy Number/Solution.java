class Solution
{
    public boolean isHappy(int n)
    {
        Set<Integer> set = new HashSet<>(Arrays.asList(n));
        while(n!=1)
        {
            int current_value=n;
            int sum=0;
            while(current_value>0)
            {
                sum+=((current_value%10)*(current_value%10));
                current_value/=10;
            }
            if(set.contains(sum))
            {
                return false;
            }
            set.add(sum);
            n=sum;
        }
        return true;
    }
}
