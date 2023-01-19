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
    public int maxDepth(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int max_depth=0;
        List<Node> list = new ArrayList<>(Arrays.asList(root));
        List<Integer> depth_list = new ArrayList<>(Arrays.asList(1));
        while(list.size()!=0)
        {
            Node pop_node=list.remove(0);
            int depth=depth_list.remove(0);
            max_depth=Integer.max(max_depth,depth);
            if(pop_node.children!=null)
            {
                list.addAll(pop_node.children);
                depth_list.addAll(Collections.nCopies(pop_node.children.size(),Integer.valueOf(depth+1)));
            }
        }
        return max_depth;
    }
}
