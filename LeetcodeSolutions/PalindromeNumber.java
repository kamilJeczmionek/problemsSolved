/*
Leetcode problem 9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.
Follow up: Could you solve it without converting the integer to a string?
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        else if(x == 0 || x < 10) return true;

        int k = 0;
        while(Math.pow(10, k) <= x){
            k++;
        }
        
        int arr[] = new int[k];
        for(int i = k-1; i >= 0 ; i--){
            arr[i] = (int)(x/(Math.pow(10, i)));
            x-=Math.pow(10, i)*arr[i];
        }
        for(int i = 0; i < k/2; i++){
            if(arr[i] != arr[k - 1 - i])return false;
        }
        return true;
    }
}
/*
This code will have to be optimised because of runtime and memory usage.
*/
