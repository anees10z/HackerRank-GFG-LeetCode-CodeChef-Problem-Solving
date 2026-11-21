# Highest and Lowest Frequencies

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array, the task is to find the difference between the highest occurrence and lowest occurrence of any numbers in an array. If only one type of element is present in the array return 0

 **Examples:** 

```
Input: arr[] = [1, 2, 2]
Output: 1
Explanation:  Lowest occurring element (1) occurs once. Highest occurring element (2) occurs 2 times
```

```
Input: arr[] = [7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5]
Output: 2
Explanation : Lowest occurring element (2) occurs once. Highest occurring element (7) occurs 3 times
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T17:01:46.310Z  

```java
class Solution {
	public int findDiff(int[] arr) {
		// code here
		Map<Integer, Integer> freq = new HashMap<>();
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		for (int num : arr) {
			lowest = Math.min(lowest, freq.get(num));
			highest = Math.max(highest, freq.get(num));
		}
		return highest - lowest;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1)