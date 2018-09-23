//Angela Kotora
import java.util.Scanner;
public class Lab2 {
    //this is my second commit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in); //prompt for user input
		int oneDay = scnr.nextInt(); //Prompt to enter 1st day
		System.out.println("Enter earlier Day");
		int oneMonth = scnr.nextInt(); // Prompt to enter 1st Month
		System.out.println("Enter earlier Month");
		int oneYear = scnr.nextInt(); // Prompt to enter 1st Year
		System.out.println("Enter earlier Year");
		
		int twoDay = scnr.nextInt(); //Prompt to enter 2nd day
		System.out.println("Enter later Day");
		int twoMonth = scnr.nextInt(); //Prompt to enter 2nd Month
		System.out.println("Enter later Month");
		int twoYear = scnr.nextInt(); // Prompt to enter 2nd Year
		System.out.println("Enter later Year");
		
		int earlierDate1 = (oneYear *365 + oneMonth * 30)+ oneDay; //Yr one calculations
		int earlierDate2 = (twoYear *365 + twoMonth * 30)+ twoDay; //Yr two calculations
		
		int dateDiff = earlierDate2 - earlierDate1; //calculation getting the difference in dates
		int day = (dateDiff % 365)% 30; //calculation btw the two dates
		int month = (dateDiff % 365) / 30; //calculation btw the two months
		int year = dateDiff / 365; //calculation btw the two years
		
		System.out.println("Days difference between:" + earlierDate2 + "-" + earlierDate1 + "=" + dateDiff + "day(s)");
		//shows the difference in the number of days
				
		return;	
			
		

	}

}
