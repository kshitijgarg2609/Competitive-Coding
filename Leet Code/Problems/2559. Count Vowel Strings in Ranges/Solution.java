class Solution
{
    public int[] vowelStrings(String[] words, int[][] queries)
    {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int prfx[] = new int[words.length+1];
        for(int i=0;i<words.length;i++)
        {
            char f=words[i].charAt(0),l=words[i].charAt(words[i].length()-1);
            prfx[i+1]+=prfx[i]+(set.containsAll(Arrays.asList(f,l))?1:0);
        }
        return Arrays.stream(queries).mapToInt(q->prfx[q[1]+1]-prfx[q[0]]).toArray();
    }
}
