
/*
Leetcode problem 2114. Maximum Number of Words Found in Sentences
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        int counter = 0;
        for(int i = 0; i < sentences.length; i++){
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' ') counter++;
            }
            if(counter + 1 > maxWords){
                maxWords = counter + 1;
            }
            counter = 0;
        }
        return maxWords;
    }
}
