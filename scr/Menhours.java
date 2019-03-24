package SoftwareEffortEstimation;

import java.util.Scanner;

public class Menhours extends WeightingExperienceFactors implements MenHrs {
	
	Scanner scan = new Scanner(System.in);
	static double menHours;
	
	public Menhours() {
		
	}
	public  Menhours(double menHours) {
		Menhours.menHours = menHours;
	}
	
	public void calculateER(){
		System.out.print("Please enter number of Factor Rating of E1 to E6 below and equal than 3 : " );
		int rating1 = scan.nextInt();
		System.out.print("Please enter number of Factor Rating of E7 to E8 above and equal than 3 : " );
		int rating2 = scan.nextInt();
		
		int totalcount = 0;
		
		totalcount = rating1 + rating2;
		
		
		double  ER = 0;	
		if(totalcount >=0 && totalcount <= 2) {
			ContextMenHrs contextMenHrs = new ContextMenHrs(new calculateMenHrs1());
			menHours =  contextMenHrs.executeMenHrs(UCP, ER);
			System.out.printf("Man-Hours : %.2f\n",menHours);
		}
		else if(totalcount>=3 && totalcount<=4) {
			ContextMenHrs contextMenHrs = new ContextMenHrs(new calculateMenHrs2());
			menHours =  contextMenHrs.executeMenHrs(UCP, ER);
			System.out.printf("Man-Hours : %.2f\n",menHours);
		}
		else {
			System.out.println("This project is at significant risk of failure with this team.");
		}
		
	}

	@Override
	public double calculationMenHrs(double UCP, double ER) {
		// TODO Auto-generated method stub
		return 0;
	}

}
