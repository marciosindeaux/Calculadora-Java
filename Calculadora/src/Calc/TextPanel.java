package Calc;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
public class TextPanel extends JPanel{
	private JTextField txt;
	public TextPanel() {
		this.setBounds(0, 0, 323, 100);
		this.setLayout(null);
		txt = new JTextField();
		txt.setBounds(0, 0, 323, 100);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEnabled(false);
		this.add(txt);
		txt.setColumns(25);
	}
	public JTextField getTxt() {
		return txt;
	}

}
