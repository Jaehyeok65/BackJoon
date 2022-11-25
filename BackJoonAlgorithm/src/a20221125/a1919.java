package a20221125;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class a1919 {
    public static int[] countAlphabet;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word1 = br.readLine();
        String word2 = br.readLine();

        countAlphabet = new int[26];
        int result = getAnagramCount(word1, word2);
        
        System.out.print(result);
    }
    public static int getAnagramCount(String word1, String word2){
        int toBeRemovedCount = 0;
        for(int index = 0; index<word1.length(); index++){
            ++countAlphabet[word1.charAt(index)-97];
        }

        for(int index =0; index<word2.length();index++){
            --countAlphabet[word2.charAt(index)-97];
        }

        for(int index = 0; index< countAlphabet.length; index++){
            int count = Math.abs(countAlphabet[index]);
            toBeRemovedCount += count;
        }

        return toBeRemovedCount;
    }
}