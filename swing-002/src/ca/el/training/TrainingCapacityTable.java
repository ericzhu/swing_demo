package ca.el.training;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

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
