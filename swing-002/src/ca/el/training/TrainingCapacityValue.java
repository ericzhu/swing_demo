package ca.el.training;

public class TrainingCapacityValue {

	private String equipment;
	private String period;
	private Integer capacity;
	private Boolean exceedable;
	private Float cost;

	public TrainingCapacityValue(String equipment, String period, Integer capacity, Boolean exceedable, Float cost) {
		super();
		this.equipment = equipment;
		this.period = period;
		this.capacity = capacity;
		this.exceedable = exceedable;
		this.cost = cost;
	}

	public TrainingCapacityValue() {

	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Boolean getExceedable() {
		return exceedable;
	}

	public void setExceedable(Boolean exceedable) {
		this.exceedable = exceedable;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

}
