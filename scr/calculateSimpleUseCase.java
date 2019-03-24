package SoftwareEffortEstimation;

public class calculateSimpleUseCase implements UseCaseType {

	@Override
	public int calculationUseCase(int qtyActor, int weightFactor) {
		weightFactor = 5;
		return qtyActor * weightFactor;
	}

}
