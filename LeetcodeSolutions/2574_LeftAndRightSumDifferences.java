/*
Leetcode problem 2574. Left and Right Sum Differences
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
*/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int answer[] = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                rightSum+=nums[j];
            }
            for(int k = 0; k < i; k++){
                leftSum+=nums[k];
            }
            answer[i] = Math.abs(rightSum - leftSum);
            rightSum = 0;
            leftSum = 0;
        }
        return answer;
    }
}
