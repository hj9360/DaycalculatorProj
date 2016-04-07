
public class DayCalculator {
	private String[] dayNames = {"Sun","Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};
	int[] numberOfMonthDay = {31,28,31,30,31,30,30,30,31,30,31,31};
	
		public int getTotalDays(int year, int month, int day){
			int totalDays = 0;
			
			for(int monthIndex = 1; monthIndex < month; monthIndex++)
				totalDays = totalDays + numberOfMonthDay[monthIndex];
			
			totalDays = totalDays + day;
			return totalDays;
			
		}
		public String getDay(int year, int month, int day) {
			int totalDays = getTotalDays(year, month, day);
			
			return dayNames[totalDays % 7];
		}
		
	}
	
