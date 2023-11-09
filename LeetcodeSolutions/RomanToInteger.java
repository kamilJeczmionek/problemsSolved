/*
Leetcode problem 13. Roman To Integer
Given a roman numeral, convert it to an integer.
*/
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        String n = s + " ";
        for(int i = 0; i < n.length(); i++){
            one: {
                if(i <= n.length() - 2){
                    String nSub = n.substring(i, i+2);
                    switch(nSub){
                        case "IV": result += 4;
                        i+=1;
                        break  one;
                        case "IX": result += 9;
                        i+=1;
                        break  one;
                        case "XL": result += 40;
                        i+=1;
                        break  one;
                        case "XC": result += 90;
                        i+=1;
                        break  one;
                        case "CD": result += 400;
                        i+=1;
                        break  one;
                        case "CM": result += 900;
                        i+=1;
                        break  one;
                    }
                }
                switch(n.charAt(i)){
                    case 'I': result += 1;
                    break;
                    case 'V': result += 5;
                    break;
                    case 'X': result += 10;
                    break;
                    case 'L': result += 50;
                    break;
                    case 'C': result += 100;
                    break;
                    case 'D': result += 500;
                    break;
                    case 'M': result += 1000;
                    break;
                }
            }
        }
        return result;
    }
}
