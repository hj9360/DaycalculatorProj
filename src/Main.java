import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		
		DayCalculator dayCalculator = new DayCalculator();
		System.out.println(dayCalculator.getDay(year, month, day));
	}

}
