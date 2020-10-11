package Projekt;
import java.awt.*; 
import java.applet.*;
import java.awt.event.*;  
public class Reckoner extends Applet implements ActionListener {

	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2,tf3;
	Label lbh,lb1,lb2,lb3,lop;
	
	public void init() {
		setBackground(Color.black);
		setFont(new Font("Algerian",Font.BOLD,35));
		setForeground(Color.white);
		lbh = new Label("************************ CALCULATOR ************************");
		lbh.setForeground(Color.BLUE);
		lbh.setBounds(100, 10, 900, 50);
		
		setFont(new Font("Algerian",Font.BOLD,25));
		lb1 = new Label("Enter 1st number: ");//label 1: num1
		lb1.setBounds(100, 110, 300, 30);
		tf1 = new TextField();//textfield1: num1
		tf1.setForeground(Color.black);
		tf1.setBounds(410, 100, 500, 40);
		
		lb2 = new Label("Enter 2nd number: ");//label2: num2
		lb2.setBounds(100, 160, 300, 30);
		tf2 = new TextField();//textfield2: num2
		tf2.setForeground(Color.black);
		tf2.setBounds(410, 150, 500, 40);
		
		lb3 = new Label("Result: ");//label3: result
		lb3.setForeground(Color.red);
		lb3.setBounds(100, 210, 300, 30);
		tf3 = new TextField();//textfield3: result
		tf3.setForeground(Color.red);
		tf3.setBounds(410, 200, 500, 40);
		
		lop = new Label("Operations: ");
		lop.setBounds(100, 300, 300, 30);

		setFont(new Font("Algerian",Font.BOLD,30));
		b1 = new Button("+");	//1: add
		b1.setForeground(Color.red);
		b1.setBounds(410, 300, 60, 50);
		b2 = new Button("-");//2: sub
		b2.setForeground(Color.red);
		b2.setBounds(510, 300, 60, 50);
		b3 = new Button("*");//3: MULT
		b3.setForeground(Color.red);
		b3.setBounds(610, 300, 60, 50);
		b4 = new Button("/");//4: DIV
		b4.setForeground(Color.red);
		b4.setBounds(710, 300, 60, 50);
		b5 = new Button("%");//5:MOD
		b5.setForeground(Color.red);
		b5.setBounds(810, 300, 60, 50);
		
		add(lbh);
		add(lb1);
		add(lb2);
		add(lb3);
		add(tf1);
		add(tf2);
		add(tf3);
		add(lop);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		setLayout(null);
	}//init() close
	public void actionPerformed(ActionEvent ae) {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		
		if(ae.getSource() == b1) {
			double res = num1 + num2;
			tf3.setText(String.valueOf(res));
		}else if(ae.getSource() == b2) {
			double res = num1 - num2;
			tf3.setText(String.valueOf(res));
		}else if(ae.getSource() == b3) {
			double res = num1 * num2;
			tf3.setText(String.valueOf(res));
		}else if(ae.getSource() == b4) {
			double res = num1 / num2;
			tf3.setText(String.valueOf(res));
		}else if(ae.getSource() == b5) {
			int res = (int)num1 % (int)num2;
			tf3.setText(String.valueOf(res));
		}
	}
   
} 