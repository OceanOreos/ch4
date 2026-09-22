public class FormatDate {
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + ", " + date + " " + month + ", " + year);
	}
	
	public static void enter() {
		System.out.println();
	}
	
	public static void main (String[] args) {
		System.out.println("Today is September 22, 2026. Here is the American format for dates: ");
		printAmerican("Tuesday", 22, "September", 2026);
		enter();
		System.out.println("Today is September 22, 2026. Here is the European format for dates: ");
		printEuropean("Tuesday", 22, "September", 2026);
	}
}
		
