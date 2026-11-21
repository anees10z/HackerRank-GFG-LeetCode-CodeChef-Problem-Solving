# reverse-array-in-groups0255

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T12:44:00.407Z  

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