package br.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ? Matches the preceding character 0 or 1 time.
 * 
 * 
 */
public class JavaRegex {
	
	public static void main(String args[]) {
	
		String v1 = "[C|E][0-9]{7}(0[1-9][0-9])?0800([0-9]{7})";
		
		String v2 = "[C|E]";
		
		String v3 = "[C|E][0-9]{7}";
		String v4 = "[C|E][0-9]{7}(0[1-9][0-9])?";
		String v5 = "[C|E][0-9]{7}(0[1-9][0-9])?0800([0-9]{7})";
		
		
				
		String match_v2 = "C";
		String match_v3 = "E2323232";
		String match_v4_1 = "E2323232";
		String match_v4_2 = "E2323232010";
			
		String match_v5_1 = "C169972605808009014950";
		String match_v5_2 = "E420827908009952331";
		
		/*
		Pattern pattern_v2 = Pattern.compile(v2);
		Matcher matcher_v2 = pattern_v2.matcher(match_v2);
		
		System.out.println("Input String matches regex - " + matcher_v2.matches());
		
		Pattern pattern_v3 = Pattern.compile(v3);
		Matcher matcher_v3 = pattern_v3.matcher(match_v3);
		
		System.out.println("Input String matches regex - " + matcher_v3.matches());
		
		
		Pattern pattern_v4 = Pattern.compile(v4);
		
		Matcher matcher_v4 = pattern_v4.matcher(match_v4_1);
		System.out.println("Input String matches regex - " + matcher_v4.matches());
		
		matcher_v4 = pattern_v4.matcher(match_v4_2);
		System.out.println("Input String matches regex - " + matcher_v4.matches());
		
		*/
		
		Pattern pattern_v5 = Pattern.compile(v5);
		
		Matcher matcher_v5 = pattern_v5.matcher(match_v5_1);
		System.out.println("Input String matches regex - " + matcher_v5.matches());
		
		matcher_v5 = pattern_v5.matcher(match_v5_2);
		System.out.println("Input String matches regex - " + matcher_v5.matches());

		System.out.println("Hello new modification 2");
		
	}

}
