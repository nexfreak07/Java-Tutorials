
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.stream.IntStream;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "Akash Dasgupta";

        //.toUpperCase() - Caps Up
        System.out.println("UpperCase : "+ str.toUpperCase());

        //.toLowerCase() - Caps Down
        System.out.println("Lower Case : "+str.toLowerCase());

        // Trim and Length
        String str1 = " Trimming ";
        System.out.println("Length before trimmming : "+str1.length());
       str1 =   str1.trim();
        System.out.println("Length after trim : "+str1.length());

        //.repeat()
        String repeat = " "+  str.repeat(3)+" ";
        System.out.println("Repeat : "+repeat);

        //Replacing Sequence
        System.out.println("Replacing Sequence "+(str.replace("Dasgupta", "DG")));

        //Replacing Characters
        System.out.println("Replacing Char : "+str.replace('a','Z'));

        //Substring(beginIndex) - BeginIndex On wards
        System.out.println("Substring - 0,5 will print 0 to 4"+ str.substring(2));

        //Substring(beginIndex, endIndex) - BeginIndex till endIndex-1 characters will be printed
        System.out.println("Substring - 2,6 will print from 2 to 5"+ str.substring(2,6));

        //CompareTo()
        String s1 = "Akash";
        String s2 = "akash";
        String s3 = "Dasgupta";
        String s4 = "Akash";
        System.out.println("Comparing same string case diff : "+ s1.compareTo(s2));
        System.out.println("Comparing Diff Strings : "+s1.compareTo(s3)); //Ascii values of 'A' - 'D' = -3
        System.out.println("Comparing same string case diff : "+ s1.compareToIgnoreCase(s2));

        //.concat()
        System.out.println("Concating s1 and s3 : "+s1.concat(s3));

        //.contains()
        System.out.println("Contains Sequence "+s1.contains("ash"));
        System.out.println("Content Equals "+s1.contentEquals("Akash")); // Same as equals

        //Equals and Equals Ignore Case
        System.out.println("Equals "+s1.equals(s2));
        System.out.println("Equals Ignore Case "+ s1.equalsIgnoreCase(s2));

        //subsequence
        System.out.println("Subsequence : "+str.subSequence(2,6)); //Same as Substring

        //.charAt()
        System.out.println("Char at index : "+s2.charAt(0));

        //.chars()

        //replace all and replace first

        //regionMatches

        //stripLeading and stripTrailing

        //strip and split

        //startsWith(index) & (prefix, int toffset)

        //endsWith(index) & (prefix, int toffset)

        //codePointAt, codePointBefore, codePointCount, codePoints

        //toCharArray()

        //.intern()

        // .isBlank();
        String k = "  ";
        System.out.println("isBlank "+k.isBlank());

        // .isEmpty()
        String a = "";
        System.out.println("isEmpty "+ a.isEmpty());

        //indexOf() - 3types and lastIndexOF - 3types
        // Indexof and LastIndexOF Gives First occurence of the character
        System.out.println("String to be indexed "+str);
        System.out.println("Index of : "+str.indexOf("ash"));
        System.out.println("Index of : "+str.indexOf("a",6));
        System.out.println("Index of : "+str.indexOf("a"));

        // Study Last Index OF
        System.out.println("Index of : "+str.lastIndexOf("Das"));
        System.out.println("Index of : "+str.lastIndexOf("a",6));
        System.out.println("Index of : "+str.lastIndexOf("p"));
        //.matches()

        //.lines()

        //getBytes()  and getChars()

        //getClass
        System.out.println(str.getClass());
        //hashCode

        System.out.println(str.hashCode());
    }
}
