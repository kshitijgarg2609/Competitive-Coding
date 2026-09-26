class Solution
{
    public String evaluate(String s, List<List<String>> knowledge)
    {
        Map<String,String> map = new HashMap<>();
        knowledge.stream().forEach(k->map.put(k.get(0),k.get(1)));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='(')
            {
                sb.append(s.charAt(i));
                continue;
            }
            String str = "";
            for(i++;i<s.length() && s.charAt(i)!=')';str+=s.charAt(i++));
            sb.append(map.getOrDefault(str,"?"));
        }
        return sb.toString();
    }
}
