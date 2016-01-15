package ca.el.component;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class CheckBoxPanelEditor extends AbstractCellEditor implements TableCellEditor {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private final JPanel p = new JPanel(new GridBagLayout());
	private final JCheckBox checkBox = new JCheckBox();

	public CheckBoxPanelEditor() {
		super();
		checkBox.setOpaque(false);
		checkBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fireEditingStopped();
			}
		});
		p.add(checkBox);
		p.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 0));
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		checkBox.setSelected(Objects.equals(value, Boolean.TRUE));
		p.setBackground(table.getSelectionBackground());
		return p;
	}

	@Override
	public Object getCellEditorValue() {
		return checkBox.isSelected();
	}
}
