package SoftwareEffortEstimation;

public class calculateMenHrs1 implements MenHrs {

	@Override
	public double calculationMenHrs(double UCP, double ER) {
		ER = 20;
				
		return UCP * ER;
	}

}
