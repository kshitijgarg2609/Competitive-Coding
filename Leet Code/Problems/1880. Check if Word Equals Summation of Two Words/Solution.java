class Solution
{
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord)
    {
        int i=firstWord.length()-1;
        int j=secondWord.length()-1;
        int k=targetWord.length()-1;
        int sum=0;
        int carry=0;
        while((i>=0) || (j>=0) || (k>=0))
        {
            int a=(i>=0)?(firstWord.charAt(i--)-'a'):0;
            int b=(j>=0)?(secondWord.charAt(j--)-'a'):0;
            int c=(k>=0)?(targetWord.charAt(k--)-'a'):0;
            sum=a+b+carry;
            if(c!=(sum%10))
            {
                return false;
            }
            carry=sum/10;
        }
        return carry==0;
    }
}
