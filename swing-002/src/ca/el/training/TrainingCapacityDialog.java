package ca.el.training;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TrainingCapacityDialog extends JPanel {

	private static final long serialVersionUID = 1L;

	public TrainingCapacityDialog() {

		TrainingCapacityTableModel tableModel = new TrainingCapacityTableModel();

		setLayout(new BorderLayout());
		add(new JScrollPane(new TrainingCapacityTable(tableModel)), BorderLayout.CENTER);

	}

}
