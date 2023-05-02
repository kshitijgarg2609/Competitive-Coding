import java.util.*;

class Solution
{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            map.put(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        while(sc.hasNextLine())
        {
            String query = sc.nextLine();
            if(map.containsKey(query))
            {
                System.out.printf("%s=%s\n",query,map.get(query));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        sc.close();
	}
}
