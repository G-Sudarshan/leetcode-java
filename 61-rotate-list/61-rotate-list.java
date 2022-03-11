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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(head==null){
            return null;
        }
        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        temp.next = head;
        k = k % count;
        int n = count - k;
        temp = head;
        
        for(int i=0; i<n; i++){
            temp = temp.next;
        }
        ListNode newHead = temp;

        
        for(int i=0; i<count-1; i++){
            temp = temp.next;
        }
        temp.next = null;
        return newHead;
        
    }
}