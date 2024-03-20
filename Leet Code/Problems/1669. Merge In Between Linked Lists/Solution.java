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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2)
    {
        ListNode ptra=list1,ptrb=list1;
        for(int i=1;i<=b;i++)
        {
            if(i<a)
            {
                ptra=ptra.next;
            }
            ptrb=ptrb.next;
        }
        for(ptra.next=list2;ptra.next!=null;ptra=ptra.next);
        ptra.next=ptrb.next;
        ptrb.next=null;
        return list1;
    }
}
