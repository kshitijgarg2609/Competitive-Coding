class Solution
{
    public int longestValidParentheses(String s)
    {
        int stack[] = new int[2];
        int operation[] = new int[2];
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch[] = new char[]{s.charAt(i),s.charAt(s.length()-1-i)};
            for(int j=0;j<2;j++)
            {
                if((j==0 && ch[j]=='(') || (j==1 && ch[j]==')'))
                {
                    stack[j]++;
                    operation[j]++;
                }
                else if((j==0 && ch[j]==')') || (j==1 && ch[j]=='('))
                {
                    if(stack[j]==0)
                    {
                        operation[j]=0;
                        continue;
                    }
                    else
                    {
                        stack[j]--;
                        operation[j]++;
                        if(stack[j]==0)
                        {
                            max=Integer.max(max,operation[j]);
                        }
                    }
                }
            }
        }
        return max;
    }
}
