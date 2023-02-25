class Solution
{
    public List<Integer> addToArrayForm(int[] num, int k)
    {
        List<Integer> addition = Arrays.stream(num).boxed().collect(Collectors.toList());
        int indx=addition.size()-1;
        int carry=0;
        while(k>0 || indx>=0)
        {
            if(k>0 && indx<0)
            {
                addition.add(0,0);
                indx=0;
            }
            int sum=(k%10)+addition.get(indx)+carry;
            carry=sum/10;
            addition.set(indx--,sum%10);
            k/=10;
        }
        if(carry>0)
        {
            addition.add(0,carry);
        }
        return addition;
    }
}
