package ca.el.training;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TrainingCapacityTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	public static final int EQUIPMENT_INDEX = 0;
	public static final int PERIOD_INDEX = 1;
	public static final int CAPACITY_INDEX = 2;
	public static final int EXCEEDABLE_INDEX = 3;
	public static final int COST_INDEX = 4;

	List<String> columnNames = Arrays.asList("Equipment", "Period", "Capacity", "Exceedable", "Cost");

	List<TrainingCapacityValue> trainingCapacityValueList = Arrays.asList(
			new TrainingCapacityValue("B737", "2013-01-01", 3, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 4, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 5, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 6, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 7, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 8, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 9, Boolean.FALSE, 300.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 10, Boolean.FALSE, 400.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 11, Boolean.FALSE, 500.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 12, Boolean.FALSE, 600.0F),
			new TrainingCapacityValue("B737", "2013-01-01", 13, Boolean.FALSE, 700.0F));

	
	@Override
	public int getRowCount() {
		return trainingCapacityValueList.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		TrainingCapacityValue value = trainingCapacityValueList.get(rowIndex);
		switch (columnIndex) {
		case EQUIPMENT_INDEX:
			return value.getEquipment();
		case PERIOD_INDEX:
			return value.getPeriod();
		case CAPACITY_INDEX:
			return value.getCapacity();
		case EXCEEDABLE_INDEX:
			return value.getExceedable();
		case COST_INDEX:
			return value.getCost();
		default:
			return null;
		}
	}

	public List<String> getColumnNames() {
		return columnNames;
	}

	public List<TrainingCapacityValue> getTrainingCapacityValueList() {
		return trainingCapacityValueList;
	}

	@Override
	public String getColumnName(int column) {
		return getColumnNames().get(column);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case CAPACITY_INDEX:
			return true;
		case EXCEEDABLE_INDEX:
			return true;
		case COST_INDEX:
			return true;
		default:
			return false;
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case CAPACITY_INDEX:
			return Integer.class;
		case EXCEEDABLE_INDEX:
			return Boolean.class;
		case COST_INDEX:
			return Float.class;

		default:
			return String.class;
		}
	}
}
