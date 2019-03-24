package SoftwareEffortEstimation;

public class ContextExperienceFactor {
	private ExperienceFactors experiencefactor;
	
	public ContextExperienceFactor(ExperienceFactors experiencefactor) {
		this.experiencefactor = experiencefactor;
	}
	
	public double executeExperienceFactor(double ProjectRating, double weightFactor) {
		return experiencefactor.calculationExperienceFactor(ProjectRating, weightFactor);
	}
}
