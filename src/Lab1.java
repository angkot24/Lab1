import java.util.Scanner;

// Angela Kotora
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is my second commit
 int num1;
 int num2;
 
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter three digit number"); //Enter no more than three digits
 num1 = scan.nextInt(); //prompt to enter number
 System.out.println("Enter three digit number"); //Enter another set of three digits
 num2 = scan.nextInt(); //prompt to enter another number
 
 if (num1 > 999)
		System.out.println("\nMust be more then 3 digits.");// Must be 3 digits
 if (num2 < 100)
		System.out.println("Must be less then 3 digits.");// Must be 3 digits
 
 int hundreds1 = (num1 / 100)%10; //first set for mathematical reasoning
 int tens1 = (num1 / 10)%10;
 int ones1 = num1 % 10;
 
 int hundreds2 = (num2 / 100)%10; //second set for mathematical reasoning
 int tens2 = (num2 / 10)%10;
 int ones2 = num2 % 10;
 
 int sumHundreds = hundreds1 + hundreds2; //int additions
 int sumTens = tens1 + tens2;
 int sumOnes = ones1 + ones2;
 
 
 
 if (sumHundreds == sumTens&sumTens == sumOnes){
     System.out.println(true); //numbers print true
} else {
  System.out.println(false); //numbers print false
}
	}

}
