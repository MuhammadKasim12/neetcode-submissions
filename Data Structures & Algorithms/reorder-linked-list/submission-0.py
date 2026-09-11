# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        current = slow.next
        prev= slow.next = None

        while current:
            next_node = current.next
            current.next = prev
            prev=current
            current = next_node
        
        first, current = head , prev
        while current:
            tmp1, tmp2 = first.next, current.next
            first.next =current
            current.next = tmp1
            first, current = tmp1, tmp2
