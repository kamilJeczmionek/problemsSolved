/*
Leetcode problem 66. Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        digits[l-1]+=1;
        int[] alt_res = new int[l+1];
        for(int i = l - 1; i >= 0; i--){
            if(i != 0 && digits[i] == 10){
                digits[i-1]+=1;
                digits[i]=0;
            }else if(i == 0 && digits[i] == 10){
                alt_res[0] = 1;
                alt_res[1] = 0;
                for(int j = 2; j < l; j++){
                    alt_res[j+1] = digits[j];
                }
                return alt_res;
            }
        }
        return digits;
    }
}
