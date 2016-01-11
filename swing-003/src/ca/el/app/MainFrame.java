package ca.el.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

   private static final long serialVersionUID = 1L;

   private JTextArea textArea;
   private JButton   btn;

   public MainFrame() {
      super("Hello Swing");
      
      textArea = new JTextArea();
      btn = new JButton("Click Me");
     
      setLayout(new BorderLayout());
      add(textArea, BorderLayout.CENTER);
      add(btn, BorderLayout.SOUTH);
      
      setSize(600, 500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
