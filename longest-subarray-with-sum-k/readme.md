# Largest Subarray with Sum K

**Platform:** GeeksforGeeks

## Problem

Given an array of integers and a target sum `k`, find the length of the
longest subarray whose elements sum up to exactly `k`.

## Example

```
Input: arr = [10, 5, 2, 7, 1, 9], k = 15
Output: 4
Explanation: The subarray [5, 2, 7, 1] sums to 15 and has length 4.
```

## Approach: Prefix Sum + HashMap

- Maintain a running sum (`sum`) as we iterate through the array.
- For each index `i`, check if `sum - k` (the "needed" prefix sum) has
  appeared before at some earlier index. If it has, the subarray between
  that earlier index and `i` sums to exactly `k`.
- Only store the **first** occurrence of each prefix sum in the map, since
  we want the **longest** subarray — an earlier index gives a longer length.
- Handle the special case where the subarray starts from index 0 (i.e.
  `sum == k` directly).

## Complexity

- **Time:** O(n)
- **Space:** O(n)
