package ca.el.component;

import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;

public class MyTableCellEditor extends AbstractCellEditor implements TableCellEditor {

	private static final long serialVersionUID = 1L;
	
	JCheckBox checkBox = new JCheckBox();
	int editedRow;
	int editedColumn;
	JTable table;

	public MyTableCellEditor(JTable table) {
		super();
		this.table = table;
		checkBox.addItemListener(new CheckBoxCellEditorListener());
		checkBox.setMultiClickThreshhold(0);
		checkBox.setSize(5, 5);
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		this.editedRow = row;
		this.editedColumn = column;
		checkBox.setBackground(UIManager.getColor("Table.selectionBackground"));
		System.out.println("getTableCellEditorComponent");
		return checkBox;
	}

	@Override
	public Object getCellEditorValue() {
		return new Boolean(checkBox.isSelected());
	}

	public JCheckBox getCheckbox() {
		return checkBox;
	}

	public int getRow() {
		return editedRow;
	}

	public int getColumn() {
		return editedColumn;
	}

	public void SetRow(int row) {
		editedRow = row;
	}

	public void SetColumn(int column) {
		editedColumn = column;
	}

}
