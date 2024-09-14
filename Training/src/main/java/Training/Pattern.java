package Training;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		 
		//int n =4;
		//int m =5;
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter row num :");
		int n = sc.nextInt();
		
		System.out.println("Enter column num :");
		int m = sc.nextInt();
	
		for(int i=1; i<=n; i++) {
			
			for(int j=1;j<=m;j++) 
				
				System.out.print("*");
			
			System.out.println();
			}
		}

	}



