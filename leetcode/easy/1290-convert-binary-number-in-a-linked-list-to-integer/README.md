# Convert Binary Number in a Linked List to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given `head` which is a reference node to a singly-linked list. The value of each node in the linked list is either `0` or `1`. The linked list holds the binary representation of a number.

Return the  *decimal value*  of the number in the linked list.

The  **most significant bit**  is at the head of the linked list.

 

 **Example 1:** 

```
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

```

 **Example 2:** 

```
Input: head = [0]
Output: 0

```

 

 **Constraints:** 

- The Linked List is not empty.
- Number of nodes will not exceed 30.
- Each node's value is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 12.66%)  
**Memory:** 42.2 MB (beats 79.63%)  
**Submitted:** 2026-11-28T17:22:48.606Z  

```java
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
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int decimalNum = 0;
        int pow = 0;
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int len = list.size();
        for (int i = len - 1; i >= 0; i--) {
            decimalNum += (int) Math.pow(2, pow++) * list.get(i);
        }

        return decimalNum;
    }
}
// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int decimalNum = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             decimalNum = decimalNum * 2 + temp.val;
//             temp = temp.next;
//         }
//         return decimalNum;
//     }
// }
```

---

[View on LeetCode](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)