package SoftwareEffortEstimation;

public class ContextReport {
	private WeightingReports wReport;
	
	public ContextReport (WeightingReports wReport) {
		this.wReport = wReport;
	}
	
	public double executeWeightingReport(double qtyReport, double averageMenHrs) {
		return ((WeightingReports) wReport).calculationWeightingReport(qtyReport,averageMenHrs);
	}
}
