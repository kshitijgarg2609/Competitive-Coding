class Solution
{
    public String reversePrefix(String word, char ch)
    {
        int indx=word.indexOf(ch);
        if(indx<0)
        {
            return word;
        }
        String rev=(new StringBuilder(word.substring(0,indx+1))).reverse().toString();
        if(indx==word.length()-1)
        {
            return rev;
        }
        return rev+word.substring(indx+1);
    }
}
