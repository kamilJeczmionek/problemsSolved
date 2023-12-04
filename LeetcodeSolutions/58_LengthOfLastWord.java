/*
Leetcode problem 58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.lastIndexOf(' ');
        return s.length() - 1 - i;
    }
}
