package SoftwareEffortEstimation;

public class calculateComplexActor implements ActorType {

	@Override
	public int calculationActorPoint(int qtyActor, int weightFactor) {
		weightFactor = 3;
		return qtyActor * weightFactor;
	}

}
