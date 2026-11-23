# Add Binary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two binary strings `a` and `b`, return  *their sum as a binary string*.

 

Original
Java
 **Example 1:** 

```
Input: a = "11", b = "1"
Output: "100"

```

 **Example 2:** 

```
Input: a = "1010", b = "1011"
Output: "10101"

```

 

 **Constraints:** 

- 1 <= a.length, b.length <= 104
- a and b consist only of '0' or '1' characters.
- Each string does not contain leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 15.10%)  
**Memory:** 43.7 MB (beats 15.64%)  
**Submitted:** 2026-11-23T03:46:44.300Z  

```java
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        StringBuilder carry = new StringBuilder("0");

        int lenA = a.length();
        int lenB = b.length();

        int i = lenA - 1;
        int j = lenB - 1;
        while (i >= 0 && j >= 0) {
            char c = carry.charAt(0);
            char currA = a.charAt(i);
            char currB = b.charAt(j);
            if ((currA == '0' && currB == '0') && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if ((currA == '0' && currB == '0') && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '1' && currB == '0') && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '0' && currB == '1') && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '1' && currB == '0') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '0' && currB == '1') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '1' && currB == '0') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            }else if ((currA == '0' && currB == '1') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } 
            else if ((currA == '1' && currB == '1') && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '1' && currB == '1') && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '1');
            }
            i--;
            j--;
        }
        while (i >= 0) {
            char c = carry.charAt(0);
            char currA = a.charAt(i);
            if (currA == '0' && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if (currA == '0' && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currA == '1' && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currA == '1' && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            }
            i--;
        }
        while (j >= 0) {
            char c = carry.charAt(0);
            char currB = b.charAt(j);
            if (currB == '0' && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if (currB == '0' && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currB == '1' && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currB == '1' && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            }
            j--;
        }
        if (carry.charAt(0) == '1')
            res.insert(0, "1");

        return res.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-binary/)