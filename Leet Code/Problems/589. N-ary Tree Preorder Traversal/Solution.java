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
    public List<Integer> preorder(Node root)
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
                ListIterator<Node> it = pop_node.children.listIterator
                (pop_node.children.size());
                while(it.hasPrevious())
                {
                    stack.push(it.previous());
                }
            }
        }
        return list;
    }
}
