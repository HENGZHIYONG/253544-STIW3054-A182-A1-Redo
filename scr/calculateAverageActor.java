package SoftwareEffortEstimation;

public class calculateAverageActor implements ActorType {

	@Override
	public int calculationActorPoint(int qtyActor, int weightFactor) {
		weightFactor = 2;
		return qtyActor * weightFactor;
	}

}
