package Calc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DigitsPanel extends JPanel implements ActionListener{
	
	private JButton[] btn = new JButton[20];
	private double val1;
	private double val2;
	private char op;
	private JTextField txtField ;
	
	public DigitsPanel(JTextField jtxt) {
		this.txtField = jtxt;
		this.setBounds(0, 100, 323, 381);
		this.setLayout(new GridLayout(5,4));
		btn[0] = new JButton("C");
		btn[1] = new JButton("%");
		btn[2] = new JButton("<");
		btn[3] = new JButton("/");
		btn[4] = new JButton("7");
		btn[5] = new JButton("8");
		btn[6] = new JButton("9");
		btn[7] = new JButton("X");
		btn[8] = new JButton("4");
		btn[9] = new JButton("5");
		btn[10] = new JButton("6");
		btn[11] = new JButton("-");
		btn[12] = new JButton("1");
		btn[13] = new JButton("2");
		btn[14] = new JButton("3");
		btn[15] = new JButton("+");
		btn[16] = new JButton("0");
		btn[17] = new JButton("^");
		btn[18] = new JButton("!");
		btn[19] = new JButton("=");
		for(int i = 0; i < 20;i++) {
			btn[i].addActionListener(this);
			this.add(btn[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton atual = (JButton)e.getSource();
		if((atual == btn[4])||(atual == btn[5])||(atual == btn[6])||(atual == btn[8])||(atual == btn[9])||(atual == btn[10])|(atual == btn[12])||(atual == btn[13])||(atual == btn[14])||(atual == btn[16])){
			if(txtField.getText().length() == 10) {
				return;
			}
			String number = atual.getText();
			txtField.setText(txtField.getText() + number);
		}else {
			if(txtField.getText().isEmpty()) {
					return;
			}
			if(atual == btn[0]) {
					op = '\u0000';
					txtField.setText("");
			}else if (atual == btn[19]) {
				if(op != '!') {
					val2 = Double.parseDouble(txtField.getText());
				}
				double result = 0.0;
				if(op == '+') {
					result = val1 + val2;
				}else if(op == '-') {
					result = val1-val2;
				}else if(op == 'X') {
					result = val1*val2;
				}else if(op == '/') {
					result = val1/val2;
				}else if(op == '!') {
					result = 1;
					for(int i = 1; i <=val1;i++) {
						result = result*i;
					}
				}else if(op == '^') {
					result = val1;
					for(int i = 0; i < val2-1;i++) {
						result = result*result;
					}
				}else if(op == '<') {
					//TODO
				}else if(op == '%') {
					result = val1*100/val2;
				}
				txtField.setText(String.valueOf(result));
				op = '\u0000';
				val1 = result;
				val2 = 0;
			}else {
				op = atual.getText().charAt(0);
				val1 = Double.parseDouble(txtField.getText());
				txtField.setText(txtField.getText() + op);
				if(op != '!') {
					txtField.setText("");
				}
				
			}
		}	
	}
	

}
