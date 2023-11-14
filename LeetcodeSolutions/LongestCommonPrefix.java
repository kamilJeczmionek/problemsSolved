/*
Leetcode problem 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortestWord = strs[0].length();
        String result = new String();
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < shortestWord){
                shortestWord = strs[i].length();
            }
        }
        for(int i = 0; i < shortestWord; i++){
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    return result;
                }
            }
            result+=strs[0].charAt(i);
        }
        return result;
    }
}
