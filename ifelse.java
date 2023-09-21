package basicprograms;

import java.util.Scanner;

public class ifelse {
	public static void main (String args[]) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number:");
		num = scanner.nextInt();
		if(num>=90)
			System.out.println("Grade A");
		else if(num>=80)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
	}

}
