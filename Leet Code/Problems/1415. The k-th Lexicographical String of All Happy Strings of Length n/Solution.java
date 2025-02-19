class Solution
{
    public String getHappyString(int n, int k)
    {
        StringBuilder lex = new StringBuilder();
        for(int i=0;i<(int)(Math.pow(3,n));i++)
        {
            StringBuilder sb = new StringBuilder(Integer.toString(i,3));
            for(;sb.length()<n;sb.insert(0,'0'));
            if(IntStream.range(0,sb.length()-1).filter(indx->sb.charAt(indx)==sb.charAt(indx+1)).count()==0 && --k==0)
            {
                sb.chars().mapToObj(c->(char)(c-'0'+'a')).forEach(c->lex.append(c));
            }
        }
        return lex.toString();
    }
}
