/*The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
Return the maximum such product difference.*/
class Solution {
        public int maxProductDifference(int[] nums) {
            int max1, max2, min1, min2;
            if (nums[1] > nums[0]) {
                max1 = min2 = nums[1];
                max2 = min1 = nums[0];
            } else {
                max2 = min1 = nums[1];
                max1 = min2 = nums[0];
            }
            for (int i = 2; i < nums.length; i++) {

                if (nums[i] >= max1) {
                    max2 = max1;
                    max1 = nums[i];
                }
                if (nums[i] < max1 & nums[i] > max2) {
                    max2 = nums[i];
                }
                if (nums[i] <= min1) {
                    min2 = min1;
                    min1 = nums[i];
                }
                if (nums[i] > min1 & nums[i] < min2) {
                    min2 = nums[i];
                }
            }
            return max1 * max2 - min1 * min2;
        }
    }

