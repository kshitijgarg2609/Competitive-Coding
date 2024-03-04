class Solution
{
    public int bagOfTokensScore(int[] tokens, int power)
    {
        int score=0;
        Arrays.sort(tokens);
        for(int l=0,r=tokens.length-1;l<=r;)
        {
            if(power>=tokens[l])
            {
                power-=tokens[l++];
                score++;
            }
            else if(l<r && score>0)
            {
                power+=tokens[r--];
                score--;
            }
            else
            {
                break;
            }
        }
        return score;
    }
}
