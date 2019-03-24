package SoftwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCasePoint extends ActorPoints implements UseCaseType{
	Scanner scan = new Scanner(System.in);
	private int simpleUCP, averageUCP, complexUCP;
	static double totalUCT;
	static double UUCP;
	
	public UseCasePoint() {
		
	}
	
	public UseCasePoint(double totalAT ,double totalUCT, double UUCP) {
		super(totalAT);
		UseCasePoint.totalUCT = totalUCT;
		UseCasePoint.UUCP = UUCP;
	}
	
	public UseCasePoint(double UUCP) {
		super(UUCP);
	}
	
	public double getTotalUCT() {
		totalUCT = simpleUCP + averageUCP + complexUCP;
		return totalUCT;
	}
	
	public double getUUCP() {
		UUCP = totalUCT + totalAT;
		return UUCP;
	}

	public void weightingUseCases() {
		int qtyUseCase =0 , weightFactor = 0;
		
		do {
			try {
				System.out.print("Please enter the quantity of simple Use Case complexity   : ");
				qtyUseCase = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextUseCase contextUseCase1 = new ContextUseCase(new calculateSimpleUseCase());
		simpleUCP = contextUseCase1.executeUseCase(qtyUseCase, weightFactor);
		System.out.println("Total for Simple Use Case is " + simpleUCP);
		
		do {
			try {
				System.out.print("Please enter the quantity of Average Use Case complexity  : ");
				qtyUseCase = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextUseCase contextUseCase2 = new ContextUseCase(new calculateAverageUseCase());
		averageUCP = contextUseCase2.executeUseCase(qtyUseCase, weightFactor);
		System.out.println("Total for Average Use Case is " + averageUCP);
		
		do {
			try {
				System.out.print("Please enter the quantity of Complex Use Case complexity  : ");
				qtyUseCase = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		scan.next();
			}
		}while(true);
		ContextUseCase contextUseCase3 = new ContextUseCase(new calculateComplexUseCase());
		complexUCP = contextUseCase3.executeUseCase(qtyUseCase, weightFactor);
		System.out.println("Total for Complex Use Case is " + complexUCP);
		System.out.println("Unadjusted Use-Case Weight (UUCW) is "+getTotalUCT());
		System.out.println("Unadjusted Use Case Point (UUCP) is "+getUUCP());
			
	}

	@Override
	public int calculationUseCase(int qtyActor, int weightFactor) {
		return 0;
	}
}
