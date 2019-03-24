package SoftwareEffortEstimation;

public class calculateComplexReport implements WeightingReports{

	@Override
	public double calculationWeightingReport(double qtyReport, double averageMenHrs) {
		averageMenHrs = 40;
		return qtyReport * averageMenHrs;
	}

}
