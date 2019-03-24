package SoftwareEffortEstimation;

public class calculateComplexUseCase implements UseCaseType {
	
	@Override
	public int calculationUseCase(int qtyActor, int weightFactor) {
		weightFactor = 15;
		return qtyActor * weightFactor;
	}
}
