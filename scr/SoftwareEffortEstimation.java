package SoftwareEffortEstimation;

public class SoftwareEffortEstimation {
	
	
	public static void main(String[] args) {
		Tables table = new Tables();
		
		//1.Actor
		ActorPoints aP = new ActorPoints();		
		table.ActorTypeTable();
		aP.weightingActors();
		aP.getTotalAT();
		
		//2.Weighting Use Cases
		UseCasePoint uCP = new UseCasePoint();		
		table.WeightingUseCaseTable();
		uCP.weightingUseCases();
		uCP.getTotalUCT();
		
		//3.Weighting Technical Factor
		WeightingTechnicalFactors wTF = new WeightingTechnicalFactors();
		table.WeightingTechnicalFactorsTable();
		wTF.CalculateWeightingTF();
		wTF.getTFactor();
		wTF.getTCF();
		wTF.getSzUC();
		
		//4.Weighting Experience Factors
		WeightingExperienceFactors wEF = new WeightingExperienceFactors();
		table.WeightingExperienceFactorsTable();
		wEF.CalculateWeightingEF();
		wEF.getEFactor();
		wEF.getEF();
		wEF.getUCP();
		
		//5.Calculating Man-Hours from UCP
		Menhours mHour = new Menhours();
		mHour.calculateER();
		
		//6.Adjusting Man-hours for Risk
		AdjustManHours aMH = new AdjustManHours();
		aMH.InputPercentage();
		
		//7.Estimating For Reports
		Report report = new Report();
		table.EstimationReportTable();
		report.wReport();
		report.getTotalR();
		report.getTotalManHours();
		
		
		
		
		
	}

}
