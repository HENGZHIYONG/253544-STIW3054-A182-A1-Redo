package SoftwareEffortEstimation;

public class calculateAverageReport implements WeightingReports{

	@Override
	public double calculationWeightingReport(double qtyReport, double averageMenHrs) {
		averageMenHrs = 20;
		return qtyReport * averageMenHrs;
	}

}
