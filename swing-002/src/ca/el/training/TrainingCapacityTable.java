package ca.el.training;

import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

import ca.el.component.CheckBoxPanelEditor;
import ca.el.component.MyTableCellRenderer;

public class TrainingCapacityTable extends JTable {

	private static final long serialVersionUID = 1L;

	public TrainingCapacityTable(TableModel tableModel) {
		super(tableModel);
		setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		setCellSelectionEnabled(true);
//		addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				int[] columns = TrainingCapacityTable.this.getSelectedColumns();
//				System.out.println(Arrays.toString(columns));
//			}
//		});
		
		setFocusable(false);
		
//		setDefaultEditor(Boolean.class, null);
//        super.updateUI();
        setDefaultEditor(Boolean.class, new CheckBoxPanelEditor());
        setDefaultRenderer(Boolean.class, new MyTableCellRenderer(this));
		
		
//		setDefaultEditor(Boolean.class, new MyTableCellEditor(this));
//		setDefaultRenderer(Boolean.class, new MyTableCellRenderer(this));
		getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] columns = TrainingCapacityTable.this.getSelectedColumns();
				System.out.println(Arrays.toString(columns));
			}
		});

	}

	@Override
	public String getColumnName(int column) {
		TrainingCapacityTableModel model = (TrainingCapacityTableModel) getModel();
		return model.getColumnNames().get(column);
	}
}
