package SoftwareEffortEstimation;

public class calculateAverageUseCase implements UseCaseType {
	
	@Override
	public int calculationUseCase(int qtyActor, int weightFactor) {
		weightFactor = 10;
		return qtyActor * weightFactor;
	}
}
