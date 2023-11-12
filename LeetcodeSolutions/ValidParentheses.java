/*
Leetcode problem 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1) Open brackets must be closed by the same type of brackets.
2) Open brackets must be closed in the correct order.
3) Every close bracket has a corresponding open bracket of the same type.
*/
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        String tempString = new String();
        String a = "()";
        String b = "[]";
        String c = "{}";
        //while(s.length() != 0){
            for(int i = 0; i < s.length() - 1; i++){
                if(i != s.length()-1 && (s.substring(i, i+2).equals(a) || s.substring(i, i+2).equals(b) || s.substring(i, i+2).equals(c))){
                    i++;
                }else if(i == s.length()-2 && (!s.substring(i).equals(a) || !s.substring(i).equals(b) || !s.substring(i).equals(c))){
                    tempString+=s.substring(i);
                    break;
                }else{
                    tempString+=s.charAt(i);
                }
            }
            System.out.print(tempString);
            if(tempString.equals(s)) return false;
            s = tempString;
            tempString = "";
        //}
        return true;
    }
}
//In progress
