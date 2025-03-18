package leetcode75;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="efghijk";

        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        String result="";
        int i=0,j=0;
        int m= word1.length();
        int n = word2.length();
        while(i<m || j<n){
            if(i<m){
                result= result + word1.charAt(i);
                i++;
            }
            if(j<n){
                result= result+ word2.charAt(j);
                j++;
            }
        }
        return result;
    }
}
