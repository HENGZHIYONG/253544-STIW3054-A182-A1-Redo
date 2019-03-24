package SoftwareEffortEstimation;

public class ContextMenHrs {
	private MenHrs menHrs;
	
	public ContextMenHrs (MenHrs menHrs) {
		this.menHrs = menHrs;
	}
	
	public double executeMenHrs(double UCP, double ER) {
		return menHrs.calculationMenHrs(UCP, ER);
	}

}
