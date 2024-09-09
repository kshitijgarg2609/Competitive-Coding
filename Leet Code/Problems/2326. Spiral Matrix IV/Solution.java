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
    public int[][] spiralMatrix(int m, int n, ListNode head)
    {
        int mat[][] = new int[m][n];
        for(int row[] : mat)
        {
            Arrays.fill(row,-1);
        }
        int dir[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int pnt[] = new int[2],d=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            mat[pnt[0]][pnt[1]]=ptr.val;
            int nxt[] = new int[]{pnt[0]+dir[d][0],pnt[1]+dir[d][1]};
            if(nxt[0]>=0 && nxt[0]<m && nxt[1]>=0 && nxt[1]<n && mat[nxt[0]][nxt[1]]==-1)
            {
                pnt=nxt;
            }
            else
            {
                d=(d+1)%4;
                pnt = new int[]{pnt[0]+dir[d][0],pnt[1]+dir[d][1]};
            }
        }
        return mat;
    }
}
