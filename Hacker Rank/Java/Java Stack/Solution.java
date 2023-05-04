import java.util.*;
class Solution
{	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
		while (sc.hasNextLine())
        {
            String str = sc.nextLine();
            boolean flg=true;
            for(char c : str.toCharArray())
            {
                if(c=='(' || c=='{' || c=='[')
                {
                    stack.push(c);
                    continue;
                }
                else if(stack.empty() || (c==')' && stack.peek().charValue()!='(') || (c=='}' && stack.peek().charValue()!='{') || (c==']' && stack.peek().charValue()!='['))
                {
                    flg=false;
                    break;
                }
                stack.pop();
            }
            flg = flg && stack.empty();
            System.out.println(flg);
            stack.clear();
		}
		sc.close();
	}
}
