package leetcode75;

class Solution {

    public static void main(String[] args){
        String s= "Aeiosnhdwibdaa";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int i=0;
        int j=word.length-1;
        String vowels = "aeiouAEIOU";
        while(j>i){
            if(!vowels.contains(""+word[i])){
                i++;
            }
            if(!vowels.contains(""+word[j])){
                j--;
            }
            if(vowels.contains(""+word[i]) && vowels.contains(""+word[j])){
                char temp = word[i];
                word[i]= word[j];
                word[j]= temp;
                i++;
                j--;
            }
        }
        return new String(word);
    }
}