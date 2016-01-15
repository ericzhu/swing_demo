package ca.el.component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxCellEditorListener implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
        System.out.println("CheckBoxCellEditorListener");		
	}

}
