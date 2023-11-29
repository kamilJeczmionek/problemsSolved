/*
Leetcode problem 1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <= i; j++){
                ans[i]+=nums[j];
            }
        }
        return ans;
    }
}
