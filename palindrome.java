package javaTestPack;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		int number= sc.nextInt();
		int temp =number;
		int reversed = 0;
			
		 while(temp > 0) {
			int num = temp%10;
			reversed = reversed*10 +num;
			 temp = temp/10;
			 System.out.print(num);
			}	
		
		 
		if(number == reversed) {
			System.out.println("\nPalindrome");
		}else {
			System.out.println("\nNot a Palidrome");
	
		 }
		}
	}


