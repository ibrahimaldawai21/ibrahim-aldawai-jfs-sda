package project;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Myframe extends JFrame implements ActionListener{
	JButton button;
	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			int response = fileChooser.showSaveDialog(button);
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
		
	}

}
