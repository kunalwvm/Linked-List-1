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
// 0(n)
// 0(n)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n==0)
        {
            return head;
        }
        ListNode dummy= new ListNode(-1);
        dummy.next=head;

        ListNode slow= dummy;
        ListNode fast=dummy;
        int count =0;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return dummy.next;
    }
}