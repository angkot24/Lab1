//Angela Kotora
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int oneDay = sc.nextInt();
		System.out.println("Enter earlier Day");
		int oneMonth = sc.nextInt();
		System.out.println("Enter earlier Month");
		int oneYear = sc.nextInt();
		System.out.println("Enter earlier Year");
		
		int twoDay = sc.nextInt();
		System.out.println("Enter later Day");
		int twoMonth = sc.nextInt();
		System.out.println("Enter later Month");
		int twoYear = sc.nextInt();
		System.out.println("Enter later Year");
		
		int earlierDate1 = (oneYear *365 + oneMonth * 30)+ oneDay;
		int earlierDate2 = (twoYear *365 + twoMonth * 30)+ twoDay;
		
		int dateDiff = earlierDate2 - earlierDate1;
		int day = (dateDiff % 365)% 30;
		int month = (dateDiff % 365) / 30;
		int year = dateDiff / 365;
		System.out.println("Days difference between:" + day + "-" + month + "=" + year + "day(s)");
        //shows the difference in the number of days
				
			
			
		

	}

}
