package SoftwareEffortEstimation;

public class Tables extends SoftwareEffortEstimation{
	
	public void ActorTypeTable() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("| Actor Complexity | Description                              |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Simple           | Defined API                              |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Average          | Interactive or Protocol driven interface |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Complex          | Graphical User Interface                 |");
		System.out.println("---------------------------------------------------------------");
	}
	
	public void WeightingUseCaseTable() {
		System.out.println("----------------------------------------------");
		System.out.println("| Use Case Type | Description                |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Simple        | 3 or fewer transactions    |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Average       | 4 to 7 transactions        |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Complex       | Greater than 7 transaction |");
		System.out.println("----------------------------------------------");
	}
	
	public void WeightingTechnicalFactorsTable() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("| Technical Factor | Factor Description                              |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T1               | Must have a distributed solution                |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T2               | Must respond to specific performance objectives |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T3               | Must meet end-user efficiency desires           |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T4               | Complex internal processing                     |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T5               | Code must be reusable                           |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T6               | Must be easy to install                         |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T7               | Must be easy to use                             |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T8               | Must be pertable                                |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T9               | Must be easy to change                          |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T10              | Must allow concurrent users                     |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T11              | Includes special security features              |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T12              | Must provide direct access for 3rd parties      |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T13              | Requires special user training facilities       |");
		System.out.println("----------------------------------------------------------------------");
	}
	
	public void WeightingExperienceFactorsTable() {
		System.out.println("----------------------------------------------------------");
		System.out.println("| Experience Factor | Factor Description                 |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E1                | Familiar with FPT software process |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E2                | Application experience             |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E3                | Paradigm experience (OO)           |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E4                | Lead analyst capability            |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E5                | Motivation                         |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E6                | Stable Requirements                |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E7                | Part-time workers                  |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E8                | Difficulty of programming language |");
		System.out.println("----------------------------------------------------------");
	}

	public void EstimationReportTable() {
		System.out.println("-----------------------------------");
		System.out.println("| Report Type | Average Man-Hours |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Simple      | 12                |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Average     | 20                |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Complex     | 40                |");
		System.out.println("-----------------------------------");
	}
}
