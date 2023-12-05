/*
Leetcode problem 1221. Split a String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
*/
class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0;
        int balance = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R') balance++;
            else balance--;
            if(balance == 0) counter++;
        }
        return counter;
    }
}
