import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

	private static String num = new String("");
	private static int decCheck = 0;

	public static void setNum(String n) {
		if (n == "."  && decCheck == 0){
			num += n;
			decCheck++;
		} if (n == "." && decCheck != 0) {
			num = num;
		} else {
			num += n;
		}
	}

	public static double doAdd(String n) {
		return 0;
	}
	public static double doSub(String n) {
		return 0;
	}
	public static double doDiv(String n) {
		return 0;
	}
	public static double doMul(String n) {
		return 0;
	}

	public static void main(String[] args) {
		JFrame buttonFrame = new JFrame();
		JTextField field = new JTextField();

		buttonFrame.getContentPane();
		buttonFrame.setTitle("Calculator");

		JButton sevButton = new JButton("7");
		JButton eigButton = new JButton("8");
		JButton ninButton = new JButton("9");
		JButton addButton = new JButton("+");
		JButton fouButton = new JButton("4");
		JButton fivButton = new JButton("5");
		JButton sixButton = new JButton("6");
		JButton subButton = new JButton("-");
		JButton oneButton = new JButton("1");
		JButton twoButton = new JButton("2");
		JButton thrButton = new JButton("3");
		JButton divButton = new JButton("/");
		JButton zerButton = new JButton("0");
		JButton decButton = new JButton(".");
		JButton ceButton = new JButton("CE");
		JButton mulButton = new JButton("*");
		JButton calcButton = new JButton("Calculate");

		sevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("7");
				field.setText(num);
        	}		
		});
		eigButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("8");
				field.setText(num);
        	}		
		});
		ninButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("9");
				field.setText(num);
        	}		
		});
		fouButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("4");
				field.setText(num);
        	}		
		});
		fivButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("5");
				field.setText(num);
        	}		
		});
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("6");
				field.setText(num);
        	}		
		});
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("1");
				field.setText(num);
        	}		
		});
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("2");
				field.setText(num);
        	}		
		});
		thrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("3");
				field.setText(num);
        	}		
		});
		zerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum("0");
				field.setText(num);
        	}		
		});
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				setNum(".");
   				field.setText(num);
        	}		
		});
		ceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				num = "";
   				decCheck = 0;
   				field.setText(num);
        	}		
		});
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	}		
		});
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	}		
		});
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	}		
		});
		mulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	}		
		});
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

        	}		
		});

		JPanel outerPanel = new JPanel(new GridLayout(3, 0));

		JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

		JPanel calcPanel = new JPanel(new GridLayout(1, 0));

		buttonPanel.add(sevButton);
		buttonPanel.add(eigButton);
		buttonPanel.add(ninButton);
		buttonPanel.add(addButton);
		buttonPanel.add(fouButton);
		buttonPanel.add(fivButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(subButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(thrButton);
		buttonPanel.add(divButton);
		buttonPanel.add(zerButton);
		buttonPanel.add(decButton);
		buttonPanel.add(ceButton);
		buttonPanel.add(mulButton);

		calcPanel.add(calcButton);

		outerPanel.add(field);
		outerPanel.add(buttonPanel);
		outerPanel.add(calcPanel);


		buttonFrame.getContentPane().add(outerPanel);

		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//buttonFrame.setSize(500, 400);
		buttonFrame.pack();
		buttonFrame.setVisible(true);
	}
}