package SoftwareEffortEstimation;

public class calculateMenHrs2 implements MenHrs{

	@Override
	public double calculationMenHrs(double UCP, double ER) {
		ER =28;
		return UCP * ER;
	}

}
