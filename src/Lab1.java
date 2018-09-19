import java.util.Scanner;

// Angela Kotora
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1;
 int num2;
 int sumNumbers;
 Scanner scan= new Scanner (System.in);
 System.out.println("Enter three digit number");
 
 num1 = scan.nextInt(); //enter number
 System.out.println("Enter three digit number");
 num2 = scan.nextInt(); //enter another number
 
 sumNumbers = num1 + num2; //add the same
 
 int hundreds1 = (num1 / 100)%10;
 int tens1 = (num1 / 10)%10;
 int ones1 = num1 % 10;
 
 int hundreds2 = (num2 / 100)%10;
 int tens2 = (num2 / 100)%10;
 int ones2 = num2 % 10;
 
 int sumHundreds = hundreds1 + hundreds2;
 int sumTens = tens1 + tens2;
 int sumOnes = ones1 + ones2;
 
 int returnNum = sumHundreds + sumTens + sumOnes;
 
 if (sumHundreds == sumTens) {
	 System.out.println(true);
	if (sumTens == sumOnes)
		System.out.println(true);
 } else {
	 System.out.println(false);
 }
	}

}
