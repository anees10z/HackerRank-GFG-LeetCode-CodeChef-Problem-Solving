# Replace all 0's with 5

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer  **n**. You need to convert all zeroes of  **n**  to 5.

 **Examples:** 

```
Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.

```

```
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T12:57:13.664Z  

```java
class Solution {
	public static int rev(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n%10;
			if (rem == 0)
				rem += 5;
			rev = rev*10 + rem;
			n = n/10;
		}
		return rev;
	}
	public int convertFive(int n) {
		// code here
		if (n == 0)
			return 5;
		int revNum = rev(n);
		if (revNum == n)
			return n;
		return rev(revNum);
		
// 		String result = String.valueOf(n).replace('0', '5');
//         return Integer.parseInt(result);
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1)