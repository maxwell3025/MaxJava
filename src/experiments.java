import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class experiments implements ActionListener {
	public void actionPerformed(ActionEvent e){
		JPanel windowContent= new JPanel();
		GridLayout gl = new GridLayout(4,2);
		windowContent.setLayout(gl);
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
	}
}
