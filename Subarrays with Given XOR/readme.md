# Subarrays with Given XOR

This repository contains an optimal solution to the popular Data Structures and Algorithms (DSA) problem: **Count the number of subarrays having a given bitwise XOR target K**.

## Problem Statement
Given an array of integers `arr` and an integer `k`, find the total number of subarrays having a bitwise XOR of all elements equal to `k`.

### Example
- **Input:** `arr = [4, 2, 2, 6, 4]`, `k = 6`
- **Output:** `3`
- **Explanation:** The subarrays are `[4, 2]`, `[2, 2, 6]`, and `[6]`.

---

## Approaches

### 1. Brute Force Approach
- **Logic:** Generate all possible subarrays using three nested loops and calculate the XOR sum for each.
- **Time Complexity:** $O(N^3)$
- **Space Complexity:** $O(1)$

### 2. Better Approach
- **Logic:** Optimize the subarray generation using two nested loops, calculating the running XOR sum on the fly.
- **Time Complexity:** $O(N^2)$
- **Space Complexity:** $O(1)$

### 3. Optimal Approach (Implemented)
- **Logic:** Uses the **Prefix XOR** technique combined with a **HashMap** to store the frequencies of previously seen prefix XOR values. This eliminates the need for nested loops.
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N)$
