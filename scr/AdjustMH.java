package SoftwareEffortEstimation;

public class AdjustMH extends AdjustManHours {
	
	AdjustMH(){
		
	}
	
	AdjustMH(double total) {
		super(total);
		// TODO Auto-generated constructor stub
	}

	double percent,total=0;
	public void calculate(double percentage) {	
		this.percent=percentage;
		total=(1+(percentage/100))*menHours;
	}
	
	public double getAdjustMenHours() {		
		return total;
	}
}
