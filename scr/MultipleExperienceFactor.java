package SoftwareEffortEstimation;

public class MultipleExperienceFactor implements ExperienceFactors{

	@Override
	public double calculationExperienceFactor(double ProjectRating, double weightFactor) {
		return ProjectRating * weightFactor;
	}
}
