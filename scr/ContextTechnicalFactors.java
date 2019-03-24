package SoftwareEffortEstimation;

public class ContextTechnicalFactors {
	private TechnicalFactor technicalfactor;
	
	public ContextTechnicalFactors(TechnicalFactor technicalfactor) {
		this.technicalfactor = technicalfactor;
	}
	
	public double executeTechnicalFactor(double ProjectRating, double weightFactor) {
		return technicalfactor.calculationTechnicalFactor(ProjectRating, weightFactor);
	}

}
