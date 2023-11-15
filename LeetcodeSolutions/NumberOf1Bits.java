/*
Leetcode problem 191. Number of 1 Bits
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
*/
public class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int counter = s.length();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') counter--;
        }
        return counter;
    }
}
