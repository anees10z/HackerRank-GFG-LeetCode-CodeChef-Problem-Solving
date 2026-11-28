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