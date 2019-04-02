package rocks.zipcode.quiz4.fundamentals;

import java.util.HashMap;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String mid = getMiddleCharacter(str).toString();
        return str.substring(0,str.length()/2) + mid.toUpperCase() + str.substring(str.length()/2+1);

    }

    public static String lowerCaseMiddleCharacter(String str) {
        String mid = getMiddleCharacter(str).toString();
        return str.substring(0,str.length()/2) + mid.toLowerCase() + str.substring(str.length()/2+1);
    }

    public static Boolean isIsogram(String str) {
        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<Character,Integer>();
        char[] strArray = str.toCharArray();
        for(char s: strArray){
            if(characterIntegerHashMap.containsKey(s)){
                characterIntegerHashMap.put(s,characterIntegerHashMap.get(s)+1);
                return false;
            }
            else {
                characterIntegerHashMap.put(s,1);
                return true;
            }
        }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i =0;i<str.length();i++)
            for(int j = i+1;j< str.length();j++) {
                if (str.charAt(i) == str.charAt(j))
                    return true;

            }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[] c = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            if (c[i] != c[i + 1]) {
                sb.append(c[i]);
            }
        }
        return  sb.toString();
    }

    public static String invertCasing(String str) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i<str.length();i++){
           int ch=str.charAt(i);
           if(ch>64&&ch<91){
               ch=ch+32;
           }
           else if(ch>96&&ch<123){
               ch=ch-32;
           }
           sb.append((char)ch);
       }
       return sb.toString();
    }
}