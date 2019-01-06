package Calc;

import java.awt.GridLayout;
import java.awt.Window.Type;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calc extends JFrame{
	public Calc() throws Exception{
		this.setTitle("Calculadora");
		this.setType(Type.UTILITY);
		this.setBounds(100, 100, 325,505 );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		TextPanel txtPanel = new TextPanel();
		DigitsPanel dgtsPanel = new DigitsPanel(txtPanel.getTxt());
		this.add(txtPanel);
		this.add(dgtsPanel);
		this.setVisible(true);
	}
	public static void main(String[] args) throws Exception{
		new Calc();
	}
}