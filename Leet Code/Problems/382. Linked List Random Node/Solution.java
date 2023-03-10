/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    ListNode list;
    public Solution(ListNode head)
    {
        list=head;
    }
    
    public int getRandom()
    {
        int val=0;
        int cnt=0;
        for(ListNode ptr=list;ptr!=null;ptr=ptr.next)
        {
            cnt++;
            if(((int)(Math.random()*cnt))==0)
            {
                val=ptr.val;
            }
        }
        return val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
