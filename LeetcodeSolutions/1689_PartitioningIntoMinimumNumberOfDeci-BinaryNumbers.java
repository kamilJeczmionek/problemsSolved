/*
Leetcode problem 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. 
For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
*/
class Solution {
    public int minPartitions(String n) {
        char max = n.charAt(0);
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) > max) max = n.charAt(i);
        }
        return Character.getNumericValue(max);
    }
}
