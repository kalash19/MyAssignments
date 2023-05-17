import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("length of string is "+ str.length());
        String str1="Hello";
        String str2="How are you";
        //joining strings
        String joined=str1+" "+str2;
        String joined1=str1.concat(" ").concat(str2);
        System.out.println(joined+" "+joined1);
        String sentence="Java String pool refers to collection of String which are stored in heap memory";
        //a
        System.out.println(" in lower case ="+sentence.toLowerCase());
        //b
        System.out.println("in upper case ="+ sentence.toUpperCase());
        //c
        System.out.println("replace a with $= "+sentence.replace("a","$"));
        //d
        System.out.println(sentence.contains("collection"));
        //e
        String sentence1="java string pool refers to collection of string which are stored in heap memory";
        System.out.println(sentence.equals(sentence1));
        //f if we ignore case then they are equal
        System.out.println(sentence.equalsIgnoreCase(sentence1));
    }
}
