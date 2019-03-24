package SoftwareEffortEstimation;

public class ContextUseCase {
	private UseCaseType usecasetype;
	
	public ContextUseCase(UseCaseType usecasetype) {
		this.usecasetype = usecasetype;
	}
	
	public int executeUseCase(int qtyActor, int weightFactor) {
		return usecasetype.calculationUseCase(qtyActor, weightFactor);
	}
}
