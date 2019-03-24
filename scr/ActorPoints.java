package SoftwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActorPoints extends SoftwareEffortEstimation implements ActorType {
	
	Scanner scan = new Scanner(System.in);
	private int simpleAP, averageAP, complexAP;
	static double totalAT;
	
	public ActorPoints() {
		
	}
	
	public ActorPoints(double totalAT) {
		super();
		ActorPoints.totalAT = totalAT;
	}
	
	public double getTotalAT() {
		totalAT = simpleAP + averageAP + complexAP;
		return totalAT;
	}

	public void weightingActors() {
		int qtyActor =0 , weightFactor = 0;
		
		do {
			try {
				System.out.print("Please enter the quantity of simple actor complexity   : ");
				qtyActor = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextActor contextActor1 = new ContextActor(new calculateSimpleActor());
		simpleAP = contextActor1.executeActor(qtyActor, weightFactor);
		System.out.println("Total for Simple Actor is " + simpleAP);
		
		do {
			try {
				System.out.print("Please enter the quantity of Average actor complexity  : ");
				qtyActor = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextActor contextActor2 = new ContextActor(new calculateAverageActor());
		averageAP = contextActor2.executeActor(qtyActor, weightFactor);
		System.out.println("Total for Average Actor is " + averageAP);
		
		do {
			try {
				System.out.print("Please enter the quantity of Complex actor complexity  : ");
				qtyActor = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextActor contextActor3 = new ContextActor(new calculateComplexActor());
		complexAP = contextActor3.executeActor(qtyActor, weightFactor);
		System.out.println("Total for Complex Actor is " + complexAP);
		System.out.printf("Unadjusted Actor Weight (UAW) is "+getTotalAT()+"\n\n");
		
			
	}
	@Override
	public int calculationActorPoint(int qtyActor, int weightFactor) {
		return 0;
	}
	
}