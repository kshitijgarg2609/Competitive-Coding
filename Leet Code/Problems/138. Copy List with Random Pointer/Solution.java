/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution
{
    public Node copyRandomList(Node head)
    {
        Map<Node,Node> map = new HashMap<>();
        for(Node ptr=head;ptr!=null;ptr=ptr.next)
        {
            map.put(ptr,new Node(ptr.val,null,null));
        }
        for(Map.Entry<Node,Node> en : map.entrySet())
        {
            en.getValue().next=map.getOrDefault(en.getKey().next,null);
            en.getValue().random=map.getOrDefault(en.getKey().random,null);
        }
        return map.get(head);
    }
}
