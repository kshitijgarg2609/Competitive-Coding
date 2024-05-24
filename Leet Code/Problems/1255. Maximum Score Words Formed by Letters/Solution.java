class Solution
{
    public int maxScoreWords(String[] words, char[] letters, int[] score)
    {
        int max = 0;
        int cnt[] = new int[26];
        for(char letter : letters)
        {
            cnt[letter-'a']++;
        }
        outer:
        for(int i=0;i<(1<<words.length);i++)
        {
            int f[] = new int[26];
            int score_cnt = 0;
            String bit = Integer.toBinaryString(i);
            for(int b=bit.length()-1,j=words.length-1;b>=0;b--,j--)
            {
                if(bit.charAt(b)=='1')
                {
                    for(char c : words[j].toCharArray())
                    {
                        f[c-'a']++;
                        if(f[c-'a']>cnt[c-'a'])
                        {
                            continue outer;
                        }
                        score_cnt+=score[c-'a'];
                    }
                }
            }
            max=Integer.max(max,score_cnt);
        }
        return max;
    }
}
