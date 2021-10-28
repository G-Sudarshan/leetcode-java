/*

19. Remove Nth Node From End of List
Medium

7309

371

Add to List

Share
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 

Follow up: Could you do this in one pass?

Accepted
1,075,167
Submissions
2,896,827

*/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int temp = 0;
        ListNode initialHead = head;
        while(head != null){
            head = head.next;
            temp++;
        }
        temp = temp - n+1;
        head = initialHead;
        for(int i=1; i<=temp; i++){
            if(i==(temp-1)){

                head.next = head.next.next;
                return initialHead;
            }
            head = head.next;
        }
        return head;
    }
}
