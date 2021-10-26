package sdp.sy_4.singletonpattern;

import java.util.Scanner;

public class PrintSpoolerMain {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Printing...");
		
		try {
			System.out.println("Selection operation:");
			System.out.println(" D ――Delete");   //Delete task
			System.out.println(" S ――Suspension");  //abort
			System.out.println(" C ――Change priorities");   //Changing Task Priority
			System.out.println(" E ――Exit");  //Sign out
			
			sc = new Scanner(System.in);
			while(true) {
				switch (sc.next()) {
				case "D":
					PrintSpoolerSingleton DeletePrint = PrintSpoolerSingleton.getInstance("Delete");
					DeletePrint.manageJobs();
					break;
				case "S":
					PrintSpoolerSingleton SuspensionPrint = PrintSpoolerSingleton.getInstance("Suspension");
					SuspensionPrint.manageJobs();
					break;
				case "C":
					PrintSpoolerSingleton ChangePrioritiesPrint = PrintSpoolerSingleton.getInstance("Change priorities");
					ChangePrioritiesPrint.manageJobs();
					break;
				case "E":
					System.exit(1);
					break;
				default:
					break;
				}
			}
			
		} catch (Exception e) {
			new PrintSpoolerException(e.getMessage());
		}
		
	}

}