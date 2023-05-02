import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> indx = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isAlphabetic(s.charAt(i)))
            {
                continue;
            }
            if(indx.size()==0)
            {
                indx.add(i);
            }
            if(i==s.length()-1 || !Character.isAlphabetic(s.charAt(i+1)))
            {
                indx.add(i+1);
                list.add(new ArrayList<>(indx));
                indx.clear();
            }
        }
        System.out.println(list.size());
        for(List<Integer> l : list)
        {
            System.out.println(s.substring(l.get(0),l.get(1)));
        }
    }
}
