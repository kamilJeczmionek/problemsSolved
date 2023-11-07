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

