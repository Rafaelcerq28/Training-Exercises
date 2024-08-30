import java.util.ArrayList;
import java.util.Arrays;

public class Coding {


public static void main(String[] args) {
    char[] alphabet = new char[26];
    String word = "hackerrank";
    String newWord = "";
    for (int i = 0; i < 26; i++) {
        alphabet[i] = (char) ('a' + i);
    }

    for(int i=0;i<word.length();i++){
        
        for(int j=0;j<alphabet.length-1;j++){
            if(word.charAt(i) == 'a'){
                newWord = ""+alphabet[25];
            }else if(alphabet[j] == word.charAt(i)){
                newWord = ""+alphabet[j-1];
            }
        }
    }

    System.out.println(newWord);


}
}
