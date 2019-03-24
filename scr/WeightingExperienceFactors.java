package SoftwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingExperienceFactors extends WeightingTechnicalFactors implements ExperienceFactors{
	
	Scanner scan = new Scanner(System.in);
	private double totalEFactor,EF;
	private double subTotal=0;
	static double [] weightFactor = {1,0.5,1,0.5,0,2,-1,-1};
	ContextExperienceFactor contextEF = new ContextExperienceFactor(new MultipleExperienceFactor());
	static double UCP;
	static int rating;
	
	public WeightingExperienceFactors(){
	}
	

	public WeightingExperienceFactors(double SzUC ,double totalEFactor) {
		super(SzUC);
		this.totalEFactor = totalEFactor;

	}
	
	public WeightingExperienceFactors(double UCP) {
		super(UCP);
	}
	
		
	public void CalculateWeightingEF() {	
		try {

		for (int i=0;i<weightFactor.length;i++) {	        
    		do {
    			System.out.printf("Please enter project rating for E%d (0-5)  : ",i+1);
    			rating = scan.nextInt();
    			subTotal = subTotal + contextTF.executeTechnicalFactor(weightFactor[i], rating);
			}while (rating<0 || rating>5);   		
        }
		}catch(InputMismatchException e) {
    		System.out.println("Invalid input!Please enter number only!");
    	}
	}

	public double getEFactor() {
		totalEFactor = subTotal;
		System.out.println("\nTotal Experience Factor : "+Math.round(totalEFactor));	
		return totalEFactor;
	}
	
	public double getEF() {
		EF = (-0.03*totalEFactor)+1.4;
		System.out.printf("Experience Factor (EF) is %.2f\n",EF);
		return EF;
	}

	public double getUCP() {
		UCP =  EF * SzUC ;
		System.out.printf("Use Case Points (UCP) is  %.2f \n",UCP);
		return UCP;
	}

	@Override
	public double calculationExperienceFactor(double ProjectRating, double weightFactor) {
		return 0;
	}

}
