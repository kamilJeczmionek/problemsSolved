/*
Leetcode problem 1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = new String();
        String wordTwo = new String();
        for(int i = 0; i < word1.length; i++){
            wordOne = wordOne.concat(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
            wordTwo = wordTwo.concat(word2[i]);
        }
        return wordOne.equals(wordTwo);
    }
}
