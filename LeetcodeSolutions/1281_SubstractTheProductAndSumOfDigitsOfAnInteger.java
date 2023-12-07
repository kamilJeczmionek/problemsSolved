/*
Leetcode problem 1281. Substract the Product and Sum of Digits of an Integer 
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int container;
        int pod = 1;
        int sod = 0;

        for(int i = 0; i <= 5; i++){
            if(n == 0) return pod - sod;
            container = n%10;
            n-=container;
            n=n/10;
            pod*=container;
            sod+=container;
        }
        return pod -sod;
    }
}
