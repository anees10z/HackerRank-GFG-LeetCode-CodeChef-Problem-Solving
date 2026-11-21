# Reverse Array in Groups

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]** and an integer  **k**, reverse every consecutive group of k elements. If fewer than k elements remain at the end, reverse all of them.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
```

```
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than the number of remaining elements, the entire array is reversed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T12:42:36.497Z  

```java
class Solution {
	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	public void reverseInGroups(int[] arr, int k) {
		// code here
		int len = arr.length;
		int i = 0;
		int rev = len / k;
		while (rev > 0) {
			reverse(arr, i, i + k - 1);
			if (i + k - 1 <= len - 1) {
				i += k;
			}
			rev--;
		}
		reverse(arr, i, len - 1);
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1)