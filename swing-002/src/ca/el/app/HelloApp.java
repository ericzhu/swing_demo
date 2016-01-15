package ca.el.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ca.el.training.TrainingCapacityDialog;

public class HelloApp {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new JFrame("Hello Frame");
				frame.setSize(600, 500);

				frame.setLayout(new BorderLayout());
				frame.add(new TrainingCapacityDialog(), BorderLayout.CENTER);

				// this setting enable exit the application after the window has
				// been closed
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}
}
