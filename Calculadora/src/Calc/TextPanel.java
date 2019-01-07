package Calc;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
public class TextPanel extends JPanel{
	private JTextField txt;
	private JTextField equation;
	public TextPanel() {
		
		this.setBounds(0, 0, 323, 178);
		this.setLayout(null);
		txt = new JTextField();
		txt.setBounds(0,58, 323, 120);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEnabled(false);
		txt.setFont(new Font("arial",Font.BOLD,40));
		txt.setBackground(Color.WHITE);
		this.add(txt);
		txt.setColumns(25);
		equation = new JTextField();
		equation.setBounds(0, 0, 323, 58);
		equation.setHorizontalAlignment(JTextField.RIGHT);
		equation.setEditable(false);
		equation.setBackground(Color.WHITE);
		equation.setFont(new Font("arial", Font.ITALIC,20));
		this.add(equation);
		
	}
	public JTextField getTxt() {
		return txt;
	}
	public JTextField getEquation() {
		return(equation);
	}

}
