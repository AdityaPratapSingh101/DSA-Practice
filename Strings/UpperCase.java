package Strings;

public class UpperCase {
    //question :- For a given String,convert each the first letter of each word to uppercase and the rest of the letters to lowercase.
    public static String toUpperCase(String str){
        StringBuilder result=new StringBuilder();
        String[] words=str.split(" ");
        for(String word:words){
            if(word.length()>0){
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();


    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println("The converted string is: "+toUpperCase(str));
    }

    
}
