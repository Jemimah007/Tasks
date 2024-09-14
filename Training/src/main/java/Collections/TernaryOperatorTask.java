package Collections;

import java.util.Scanner;

public class TernaryOperatorTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		String mark = (num>40)?"Pass":"Fail";
		System.out.println(mark);

	}

}
