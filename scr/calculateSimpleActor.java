package SoftwareEffortEstimation;

public class calculateSimpleActor implements ActorType {

	@Override
	public int calculationActorPoint(int qtyActor, int weightFactor) {
		weightFactor = 1;
		return qtyActor * weightFactor;
	}

}
