package proposal;

import javax.swing.*;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class proposal extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(300, 200);
		frame.setTitle("August, 15 2022");
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		
		JLabel lbl2 = new JLabel("Can you be my Girlfriend?");
		lbl2.setBounds(10, 30, 200, 25);
		lbl2.setOpaque(true);
		panel.add(lbl2);
		
		JButton btn = new JButton("Yes");
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		btn.setBounds(50, 50, 80, 25);
		panel.add(btn);
		
		JButton btn2 = new JButton("No");
		btn2.setOpaque(true);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(145, 50, 80, 25);
		panel.add(btn2);
		
		{
			// Effect if you click the exit button and use option pane. 
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Today is my happiest day of my life, I love you in every Universe <3");
				}			     
			});
		}
		{
			// Effect if you click the exit button and use option pane. 
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent event) {
				JOptionPane.showMessageDialog(null, "It's okay, maybe today is not our time for that :)");
				}			     
			});
		}
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}