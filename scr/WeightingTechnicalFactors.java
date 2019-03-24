package SoftwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingTechnicalFactors extends UseCasePoint implements TechnicalFactor{
	Scanner scan = new Scanner(System.in);
	private double totalTFactor,TCF,rating;
	private double subTotal=0;
	double [] weightFactor = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
	ContextTechnicalFactors contextTF = new ContextTechnicalFactors(new MultipleTechnicalFactor());
	static double SzUC;
	
	public WeightingTechnicalFactors(){
	}
	

	public WeightingTechnicalFactors(double UUCP ,double totalTFactor) {
		super(UUCP);
		this.totalTFactor = totalTFactor;

	}
	
	public WeightingTechnicalFactors(double SzUC) {
		super(SzUC);

	}
		
	public void CalculateWeightingTF() {	
		try {
		for (int i=0;i<weightFactor.length;i++) {	        
    		do {
    			System.out.printf("Please enter project rating for T%d (0-5)  : ",i+1);
    			rating = scan.nextInt();
    			subTotal = subTotal + contextTF.executeTechnicalFactor(weightFactor[i], rating);
			}while (rating<0 || rating>5);   		
        }
		}catch(InputMismatchException e) {
    		System.out.println("Invalid input!Please enter number only!");
    	}
	}

	public double getTFactor() {
		totalTFactor = subTotal;
		System.out.println("\nTotal Technical Factor : "+Math.round(totalTFactor));	
		return totalTFactor;
	}
	
	public double getTCF() {
		TCF = (0.01*totalTFactor)+0.6;
		System.out.println("Technical Complexity Factor (TCF) is "+TCF);
		return TCF;
	}

	public double getSzUC() {
		SzUC = (double) TCF * UUCP;
		System.out.println("Size of the software (SzUC) is "+SzUC);
		return SzUC;
	}
	@Override
	public double calculationTechnicalFactor(double ProjectRating, double weightFactor) {
		return 0;
	}	
}