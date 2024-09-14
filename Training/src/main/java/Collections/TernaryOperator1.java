package Collections;

import java.util.Scanner;

public class TernaryOperator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		String result = (num>0)?"Positive":"Negative";
		System.out.println(result);

	}

}
