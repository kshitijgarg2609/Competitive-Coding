class Solution
{
    public int isPrefixOfWord(String sentence, String searchWord)
    {
        int indx=-1;
        String words[] = sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(searchWord))
            {
                indx=i+1;
                break;
            }
        }
        return indx;
    }
}
