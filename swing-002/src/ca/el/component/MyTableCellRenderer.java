package ca.el.component;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRenderer extends JCheckBox implements TableCellRenderer {

	private static final long serialVersionUID = 1L;

	private final JPanel p = new JPanel(new GridBagLayout());
	
	JTable table;
	protected boolean mousePressed = false;
	protected int column;
	protected int row;

	public MyTableCellRenderer(JTable table) {
		super();
		
		
		this.table = table;
		
		setOpaque(false);
//		addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				fireEditingStopped();
//			}
//		});
		p.add(this);
		p.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 0));
		this.setMultiClickThreshhold(0);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		setSelected(Objects.equals(value, Boolean.TRUE));
//		p.setBackground(table.getSelectionBackground());
		return p;
	}
}
