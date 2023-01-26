/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution
{
    public List<Integer> postorder(Node root)
    {
        List<Integer> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty())
        {
            Node pop_node = stack.pop();
            list.add(pop_node.val);
            if(pop_node.children!=null)
            {
                for(Node n : pop_node.children)
                {
                    stack.push(n);
                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}
