class Solution
{
    public String mapWordWeights(String[] words, int[] weights)
    {
        StringBuilder sb = new StringBuilder();
        for(String w : words)
        {
            int weight=w.chars().map(c->weights[c-'a']).sum()%26;
            sb.append((char)('a'+25-weight));
        }
        return sb.toString();
    }
}
