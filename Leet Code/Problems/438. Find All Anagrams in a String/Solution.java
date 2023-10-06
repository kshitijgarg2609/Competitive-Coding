class Solution
{
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> list = new LinkedList<>();
        int cnt[] = new int[26];
        for(char c : p.toCharArray())
        {
            cnt[c-'a']++;
        }
        for(int i=0;(i+p.length())<=s.length();i++)
        {
            if(cnt[s.charAt(i)-'a']!=0)
            {
                int arr[] = Arrays.copyOf(cnt,cnt.length);
                for(int j=i;j<(i+p.length());j++)
                {
                    arr[s.charAt(j)-'a']--;
                }
                if(Arrays.stream(arr).filter(x->(x==0)).count()==cnt.length)
                {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
