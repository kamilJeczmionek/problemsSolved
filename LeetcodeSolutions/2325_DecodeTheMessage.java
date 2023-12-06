/*
Leetcode problem 2325. Decode the Message
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), 
we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.
*/
class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        String newKey = new String();
        String decodedMessage = new String();
            for(int i = 0, j = 0; i < key.length(); i++){
            one:{
                for(int k = 0; k < newKey.length(); k++){
                    if(key.charAt(i) == newKey.charAt(k)) break one;
                }
                newKey+=key.charAt(i);
            }
        }
        for(int i = 0; i < message.length(); i++){
            for(int k = 0; k < newKey.length(); k++){
                if(message.charAt(i) == newKey.charAt(k)){
                    decodedMessage+=(char)(97 + k);
                }else if(message.charAt(i) == ' '){
                    decodedMessage+=message.charAt(i);
                    break;
                } 
            }
        }
        return decodedMessage;
    }
}
//This code works, but it should be optimised because of runtime and memory consumption
