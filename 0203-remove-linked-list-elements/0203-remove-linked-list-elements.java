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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null || head.next==null && head.val==val)return null;
       ListNode temp=head;
       
       while(temp!=null && temp.val==val){
        head=temp.next;
        temp=temp.next;
       }
       temp=head;
       ListNode curr=head;
       while(temp!=null){
        if(temp.val==val){
            curr.next=temp.next;
        }
        else {
            curr=temp;             
        }
        temp=temp.next; 
       }
       
        return head;
    }
}