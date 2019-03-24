package SoftwareEffortEstimation;

public class calculateSimpleReport implements WeightingReports{

	public double calculationWeightingReport(double qtyReport, double averageMenHrs) {
		averageMenHrs = 12;
		return qtyReport * averageMenHrs;
	}

}
