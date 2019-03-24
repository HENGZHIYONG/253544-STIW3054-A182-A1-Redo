package SoftwareEffortEstimation;

import java.util.Scanner;

public class AdjustManHours extends Menhours  {
	Scanner scan = new Scanner(System.in);
	double percentage;
	static double total;
	
	AdjustManHours(){
		
	}
	
	AdjustManHours(double total){
		AdjustManHours.total = total;
	}
	
	public void InputPercentage() {
		System.out.print("\nPlease enter the  coefficient as the percentage : ");
		percentage = scan.nextDouble();
		AdjustMH adjMH = new AdjustMH();
		adjMH.calculate(percentage);
		total = adjMH.getAdjustMenHours();
		System.out.printf("Adjusted man-hours : %.2f\n", total);
	}
	
}
