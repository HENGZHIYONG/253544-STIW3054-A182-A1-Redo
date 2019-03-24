package SoftwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Report extends AdjustManHours implements WeightingReports  {

	
	Scanner scan = new Scanner(System.in);
	private double simpleR, averageR, complexR;
	double totalManHours;
	static double totalR;
	
	
	public Report() {
	
	}
	
	public Report(double totalR , double total , double totalManHours) {
		super(total);
		this.totalR = totalR;
		this.totalManHours = totalManHours;
		
	}
	
	public double getTotalR() {
		totalR = simpleR + averageR + complexR;
		return totalR;
	}
	
	public double getTotalManHours() {
		totalManHours = totalR + total;
		return totalManHours;
	}
	
	public void wReport() {
		double qtyReport =0 ,  averageMenHrs =0;
		do {
			try {
				System.out.print("Please enter the quantity of simple Report Type complexity   : ");
				qtyReport = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextReport contextReport1 = new ContextReport(new calculateSimpleReport());
		simpleR = contextReport1.executeWeightingReport(qtyReport , averageMenHrs);
		System.out.println("Total for Simple Report Type is " + simpleR);
		
		do {
			try {
				System.out.print("Please enter the quantity of Average Report Type complexity  : ");
				qtyReport = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextReport contextReport2 = new ContextReport(new calculateAverageReport());
		averageR = contextReport2.executeWeightingReport(qtyReport , averageMenHrs);
		System.out.println("Total for Average Report is " + averageR);
		
		do {
			try {
				System.out.print("Please enter the quantity of Complex Report Type complexity  : ");
				qtyReport = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextReport contextReport3 = new ContextReport(new calculateComplexReport());
		complexR = contextReport3.executeWeightingReport(qtyReport , averageMenHrs);
		System.out.println("Total for Complex Report is " + complexR);
		System.out.println("Total Report Man-hour Estimate : "+getTotalR());
		System.out.printf("Total Man-hour : %.2f\n",getTotalManHours());
			
	}
		
	@Override
	public double calculationWeightingReport(double qtyReport, double averageMenHrs) {
		// TODO Auto-generated method stub
		return 0;
	}

}
