/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA ;
        ListNode temp2=headB ;
        int a=0,b=0;

        while(temp1!=null)
        {
            a++;
            temp1=temp1.next;
        }
        
        while(temp2!=null)
        {
            b++;
            temp2=temp2.next;
        }

         temp1=headA;
         temp2=headB;

    while(a!=b)
    {
        if(a>b)
        {
            temp1=temp1.next;
            a--;
        }
        else
        {
            temp2=temp2.next;
            b--;
        }
    }

        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2)
            {
                return temp1;
            }
            else
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            }
            return null;
        }
        
    }
