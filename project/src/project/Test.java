package project;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class Test implements ActionListener{
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu1, menu2;
	JMenu subMenu;
	JMenuItem menuItem1, menuItem2, menuItem3;
	JCheckBoxMenuItem checkItem1, checkItem2;
	
	public Test() {
		menuBar = new JMenuBar();
		
		menu1 = new JMenu("File");
		menuBar.add(menu1);
		menuItem1 = new JMenuItem("Final Results");
		menuItem1.addActionListener(this);
		menu1.add(menuItem1);
		
		menuItem2 = new JMenuItem("Menu2");
		menuItem2.addActionListener(this);
		menu1.add(menuItem2);
		
		menuItem3 = new JMenuItem("Exit");
		menuItem3.addActionListener(this);
		menu1.add(menuItem3);
		
		
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setJMenuBar(menuBar);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			System.out.println("the final results are");
		}
		if (e.getSource() == menuItem2) {
			System.out.println("you went to the second menu");
		}
		if (e.getSource() == menuItem3) {
			System.out.println("Exited");
		}

	}

}
