/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution
{
    public Node cloneGraph(Node node)
    {
        if(node==null)
        {
            return null;
        }
        Map<Integer,Node> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Queue<Node> qu = new LinkedList<>(){{add(node);}};
        while(!qu.isEmpty())
        {
            Node pop = qu.remove();
            if(set.contains(pop.val))
            {
                continue;
            }
            map.putIfAbsent(pop.val,new Node(pop.val));
            Node n = map.get(pop.val);
            for(Node ch : pop.neighbors)
            {
                map.putIfAbsent(ch.val,new Node(ch.val));
                n.neighbors.add(map.get(ch.val));
                qu.add(ch);
            }
            set.add(pop.val);
        }
        return map.get(node.val);
    }
}
