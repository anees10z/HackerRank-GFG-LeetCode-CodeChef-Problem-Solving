# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

Original
Java
 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 95.18%)  
**Memory:** 44.2 MB (beats 99.25%)  
**Submitted:** 2026-11-24T08:56:15.539Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = -1;
        int prevCloset = Integer.MAX_VALUE;

        for (int i = 0; i < len - 2; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(target - sum);
                if (diff < prevCloset) {
                    ans = sum;
                    prevCloset = diff;
                }
                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                else
                    return sum;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)