package SoftwareEffortEstimation;

public class MultipleTechnicalFactor implements TechnicalFactor{

	@Override
	public double calculationTechnicalFactor(double ProjectRating, double weightFactor) {
		return ProjectRating * weightFactor;
	}

}
