class Solution
{
    public int uniqueMorseRepresentations(String[] words)
    {
        String morse_code[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> transformed_set = new HashSet<>();
        for(String w : words)
        {
            StringBuilder sb = new StringBuilder(100);
            for(char c : w.toCharArray())
            {
                sb.append(morse_code[c-'a']);
            }
            transformed_set.add(sb.toString());
        }
        return transformed_set.size();
    }
}
