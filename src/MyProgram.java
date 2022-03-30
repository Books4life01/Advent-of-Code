import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import java.nio.CharBuffer;

// Example for Reading from File
// T will store number of test cases
// N will store the number of tests for each case

public class MyProgram {
    public static String INPUT_FILE_NAME = "Prob00.in.txt";

    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            // get the number of test cases
            int T = Integer.parseInt(br.readLine());

            // loop through test cases
            for (int i = 0; i < T; i++) {
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());

                // loop through the lines
                for (int j = 0; j < N; j++) {
                    // read the line of text to get the test data
                    inLine = br.readLine();


                    System.out.println(inLine);
                }
            }

            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        doStuff("hello");
    }

    // TODO: add your code here

    public static void doStuff(String inLine) {
        System.out.println(from(inLine, -2));
    }

    // todo: HELPER FUNCTIONS

    /**
     * Shorthand for System.out.println().
     *
     * @param s the string to print
     * @return the string
     */
    public static void send(String s) {
        System.out.println(s);
    }

    /**
     * Even Shorter Shorthand for System.out.println().
     *
     * @param s the string to print
     * @return the string
     */
    public static void p(String s) {
        System.out.println(s);
    }
    

    /**
     * Converts a string to a double.
     *
     * @param s the string to convert
     * @return the double
     */
    public static double toDouble(String s) {
        return Double.parseDouble(s);
    }

    /**
     * Converts a string to an integer.
     *
     * @param s the string to convert
     * @return the integer
     */
    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    /**
     * Converts a string to a long.
     *
     * @param s the string to convert
     * @return the long
     */
    public static long toLong(String s) {
        return Long.parseLong(s);
    }

    /**
     * Converts a string to a boolean.
     *
     * @param s the string to convert
     * @return the boolean
     */
    public static boolean toBoolean(String s) {
        return Boolean.parseBoolean(s);
    }

    /**
     * Converts a string to a char.
     *
     * @param s the string to convert
     * @return the char
     */
    public static char toChar(String s) {
        return s.charAt(0);
    }

    /**
     * Converts a string to a byte.
     *
     * @param s the string to convert
     * @return the byte
     */
    public static byte toByte(String s) {
        return Byte.parseByte(s);
    }

    /**
     * Converts a string to a short.
     *
     * @param s the string to convert
     * @return the short
     */
    public static short toShort(String s) {
        return Short.parseShort(s);
    }

    /**
     * Converts a string to a float.
     *
     * @param s the string to convert
     * @return the float
     */
    public static float toFloat(String s) {
        return Float.parseFloat(s);
    }

    /**
     * Converts a string to a BigInteger.
     *
     * @param s the string to convert
     * @return the BigInteger
     */
    public static BigInteger toBigInteger(String s) {
        return new BigInteger(s);
    }

    /**
     * Converts a string to a BigDecimal.
     *
     * @param s the string to convert
     * @return the BigDecimal
     */
    public static BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    /**
     * Converts a string to a BigInteger.
     *
     * @param s the string to convert
     * @return the BigInteger
     */
    public static BigInteger toBigInteger(String s, int radix) {
        return new BigInteger(s, radix);
    }
    /**
     * Converts an array to List
     * @param o
     * @return
     */
    
    public static List<Object> toList(Object o) {
        return Arrays.asList(o);
    }
    /**
     * Converts a List to array
     * @param o
     * @return
     */
    public static Object[] toArray(ArrayList<Object> o)
    {
        return o.toArray();
    }

    /**
     * Converts an int[] to Integer[]
     * @param o
     * @return
     */
    public static Integer[] boxInt(int[] i){
        return Arrays.stream(i).boxed().toArray(Integer[]::new);
    }

    /**
     * Converts an char[] to Char[]
     * @param o
     * @return
     */
    public static Character[] boxChar(char[] c){
        return CharBuffer.wrap(c).chars().mapToObj(i -> (char) i).toArray(Character[]::new);
    }

    /**
     * Converts an double[] to Double[]
     * @param d
     * @return
     */
    public static Double[] boxDouble(double[] d){
        return Arrays.stream(d).boxed().toArray(Double[]::new);
    }

        /**
     * Converts an Integer[] to int[]
     * @param o
     * @return
     */
    public static int[] unboxInt(Integer[] i){
        return Arrays.stream(i).mapToInt(Integer::intValue).toArray();
    }

    /**
     * Converts an Character[] to char[]
     * @param o
     * @return
     */
    public static char[] unboxChar(Character[] c){
        return Arrays.stream(c).map(ch -> ch.toString()).collect(Collectors.joining()).toCharArray();
    }

    /**
     * Converts an Double[] to double[]
     * @param d
     * @return
     */
    public static double[] unboxDouble(Double[] d){
        return Stream.of(d).mapToDouble(Double::doubleValue).toArray();
    }


    //more useful methods

    /**
     * Returns the a char equivilant of the int array
     *
     * @param o the int array
     * @return the char array
     */
    public static char[] intToChar(int[] i){
        char[] c = new char[i.length];
        for(int j = 0; j < i.length; j++){
            c[j] = (char) i[j];
        }
        return c;
    }

    /**
     * Returns a boolean representing if one int or char array is a subset of another
     * one method takes an int and another takes a char array using overloading
     *
     * @param o the int array
     * @return boolean 
     */
    public static boolean isSubset(int[] a, int[] b) {
        String as = intToChar(a).toString();
        String bs = intToChar(b).toString();
        return as.contains(bs) || bs.contains(as);
    }

    public static boolean isSubset(char[] a, char[] b) {
        String as = a.toString();
        String bs = b.toString();
        return as.contains(bs) || bs.contains(as);
    }

    /**
     * Rounds a double to the nearest integer.
     *
     * @param d      the double to round
     * @param places the number of decimal places to round to
     * @return the rounded double
     */
    public static double round(double d, int places) {
        double multiplier = Math.pow(10, places);
        return Math.round(d * multiplier) / multiplier;
    }

    /**
     * Find the letter at a given index in a string.
     *
     * @param s the string to search
     * @param i the index of the letter to find
     * @return the letter at the given index
     */
    public static String letterAt(String s, int i) {
        if(i <0 && i >s.length())
            return null;
        else if (i < 0) {
            return String.valueOf(s.charAt(s.length() + i));
        } else {
            return String.valueOf(s.charAt(i));
        }
    }
    /**
     * can return a substring using negative indexes
     * @param s
     * @param beg
     * @param end
     * @return
     */
    public static String fromTo(String s, int beg, int end){
        if(beg <0 && end < 0)
        {
            return s.substring(s.length() + beg, s.length() + end);
        }
        else if(beg>0 && end >0)
        {
            return s.substring(beg, end);
        }
        else return null;
    }
    /**
     * can return a susbtring using a singular negative index
     * @param s
     * @param beg
     * @return
     */
    public static String from(String s, int beg)
    {
        if(beg<0)
        {
            return s.substring(s.length() + beg);
        }
        else if(beg>0)
        {
            return s.substring(beg);
        }
        else return null;
    }
    
}
