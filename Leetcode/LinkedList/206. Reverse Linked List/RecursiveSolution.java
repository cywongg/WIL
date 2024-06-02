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
class Solution {
    public ListNode reverseList(ListNode head) {
        return recurse(null, head);
    }

    public ListNode recurse(ListNode prev, ListNode curr){
        // Base case
        if (curr == null) return prev;

        // Save next node
        ListNode currNext = curr.next;

        // Flip
        curr.next = prev;

        // Reverse rest of the list
        return recurse(curr, currNext);
    }
}