package CorePractice;

import java.util.Scanner;

public class StringAccuricy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string :- ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter second string :- ");
		String s2 = sc.nextLine();
		
		int matchCount = 0;
		int minLength = Math.min(s1.length(), s2.length());
		int maxLength = Math.max(s1.length(), s2.length());
		double accuracy = 0;
		
		if (s1.equals(s2)) {
			
			accuracy = (maxLength / (double)minLength) * 100;
			
		} else {
			for(int i = 0; i < minLength; i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					matchCount ++;
				}
			}
			
			accuracy = (matchCount / (double)minLength) * 100;
		}
		
		System.out.println(accuracy);
		
		sc.close();
	}
}