class Solution
{
    public List<String> stringMatching(String[] words)
    {
        List<String> list = new LinkedList<>();
        String str[] = Arrays.stream(words).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        outer:
        for(int p=0;p<str.length-1;p++)
        {
            String a=str[p];
            int len_a=a.length();
            int lps[] = new int[len_a];
            int i=0,j=1;
            for(;j<len_a;j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    lps[j]=++i;
                }
            }
            for(int q=p+1;q<str.length;q++)
            {
                String b=str[q];
                int len_b=b.length();
                for(i=0,j=0;(len_b-j)>=(len_a-i);)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        i++;
                        j++;
                    }
                    if(i==len_a)
                    {
                        list.add(a);
                        continue outer;
                    }
                    if(j<len_b && a.charAt(i)!=b.charAt(j))
                    {
                        if(i!=0)
                        {
                            i=lps[i-1];
                        }
                        else
                        {
                            j++;
                        }
                    }
                }
            }
        }
        return list;
    }
}
