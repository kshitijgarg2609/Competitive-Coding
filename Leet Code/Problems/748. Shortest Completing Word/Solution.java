class Solution
{
    public String shortestCompletingWord(String licensePlate, String[] words)
    {
        List<Character> minLP = new LinkedList<>();
        for(char c : licensePlate.toCharArray())
        {
            if(Character.isAlphabetic(c))
            {
                minLP.add(Character.toLowerCase(c));
            }
        }
        String ans="";
        int len=Integer.MAX_VALUE;
        for(String w : words)
        {
            if(w.length()<len)
            {
                List<Character> list = new ArrayList<>(minLP);
                for(char c : w.toCharArray())
                {
                    list.remove(Character.valueOf(c));
                }
                if(list.size()==0)
                {
                    ans=w;
                    len=w.length();
                }
            }
        }
        return ans;
    }
}
