package SoftwareEffortEstimation;

public class ContextActor {
	private ActorType actortype;
	
	public ContextActor(ActorType actortype) {
		this.actortype = actortype;
	}
	
	public int executeActor(int qtyActor, int weightFactor) {
		return actortype.calculationActorPoint(qtyActor, weightFactor);
	}

}
