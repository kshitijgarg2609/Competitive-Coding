class Solution
{
    public String minWindow(String s, String t)
    {
        int match_cnt=t.length();
        if(match_cnt>s.length())
        {
            return "";
        }
        Map<Character,Integer> map_t = new HashMap<>();
        Map<Character,Integer> map_s = new HashMap<>();
        int indx[] = new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++)
        {
            map_t.put(t.charAt(i),map_t.getOrDefault(t.charAt(i),0)+1);
        }
        map_t.keySet().stream().forEach(k->map_s.put(k,0));
        for(int i=0,j=0,cnt=0;i<s.length();)
        {
            char ch=s.charAt(i++);
            if(!map_t.containsKey(ch))
            {
                continue;
            }
            map_s.put(ch,map_s.get(ch)+1);
            if(map_s.get(ch)<=map_t.get(ch))
            {
                cnt++;
            }
            while(cnt==match_cnt && j<i)
            {
                if(min>(i-j))
                {
                    min=i-j;
                    indx=new int[]{j,i};
                }
                ch=s.charAt(j++);
                if(!map_t.containsKey(ch))
                {
                    continue;
                }
                map_s.put(ch,map_s.get(ch)-1);
                if(map_s.get(ch).intValue()<map_t.get(ch).intValue())
                {
                    cnt--;
                }
            }
        }
        return (min==Integer.MAX_VALUE)?"":s.substring(indx[0],indx[1]);
    }
}
