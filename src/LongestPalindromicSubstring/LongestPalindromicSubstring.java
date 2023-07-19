package LongestPalindromicSubstring;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	 public static String longestPalindromicSubstring(String word)
	 {
	        String result = "";
	        int maxLength = Integer.MIN_VALUE;
	        for (int i = 0 ; i < word.length() ; i++)
	        {
	            for (int j = i + 1 ; j < word.length() ; j++)
	            {
	                if (word.charAt(i) == word.charAt(j) && (palindromeOrNot(word.substring(i, j+1))))
	                {
	                    int length = word.substring(i, j + 1).length();
	                    if (length > maxLength)
	                    {
	                        maxLength = length;
	                        result = word.substring(i,j + 1);
	                    }
	                }
	            }
	        }
	        return result;
	    }

	    public static boolean palindromeOrNot(String s)
	    {
	        StringBuilder stringBuilder = new StringBuilder(s);
	        return (stringBuilder.reverse().toString().equals(s)) ? true : false;
	    }

	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.nextLine();
	        System.out.println(longestPalindromicSubstring(s));
	    }

}
