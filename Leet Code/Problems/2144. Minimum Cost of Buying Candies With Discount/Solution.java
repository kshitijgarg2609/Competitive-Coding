class Solution
{
    public int minimumCost(int[] cost)
    {
        Stack<Integer> st = new Stack<>();
        Arrays.stream(cost).sorted().forEach(c->st.push(c));
        int total=0;
        for(;st.size()>=3;total+=st.pop()+st.pop(),st.pop());
        for(;!st.isEmpty();total+=st.pop());
        return total;
    }
}
