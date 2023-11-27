/*
Leetcode problem 1672. Richest Customer Wealth
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth.
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int counter = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                counter+=accounts[i][j];
            }
            if(counter > maxWealth){
                maxWealth = counter;
            }
            counter = 0;
        }
        return maxWealth;
    }
}
