class Solution
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        int i1=0,i2=0;
        for(int j1=0,j2=0;i1<word1.length && i2<word2.length;)
        {
            if(word1[i1].charAt(j1++)!=word2[i2].charAt(j2++))
            {
                return false;
            }
            if(j1==word1[i1].length())
            {
                j1=0;
                i1++;
            }
            if(j2==word2[i2].length())
            {
                j2=0;
                i2++;
            }
        }
        return i1==word1.length && i2==word2.length;
    }
}
