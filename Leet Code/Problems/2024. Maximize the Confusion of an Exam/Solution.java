class Solution
{
    public int maxConsecutiveAnswers(String answerKey, int k)
    {
        int max=0;
        for(int start=0,i=0,Tcnt=0,Fcnt=0;i<answerKey.length();i++)
        {
            if(answerKey.charAt(i)=='T')
            {
                Tcnt++;
            }
            else
            {
                Fcnt++;
            }
            while(start<i && Integer.min(Tcnt,Fcnt)>k)
            {
                Tcnt-=(answerKey.charAt(start)=='T')?1:0;
                Fcnt-=(answerKey.charAt(start++)=='F')?1:0;
            }
            max=Integer.max(max,i-start+1);
        }
        return max;
    }
}
