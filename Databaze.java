package cviceni_2;

public class Databaze {
	private String name;
	private Integer year;
	private Double workingHours;
	
	static Double maxWorkingHours = 1.0;

	public Databaze(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
		this.workingHours = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	static void setMaxWorkingHours(Double newMaxWorkingHours) {
		maxWorkingHours = newMaxWorkingHours;
	}
	
	public boolean checkAndSetWorkingHours(Double newWorkingHours){
		if (this.workingHours + newWorkingHours > this.maxWorkingHours) {
			return false;
		}
		else {
			this.workingHours += newWorkingHours;
			return true;
		}
	}

	
}
