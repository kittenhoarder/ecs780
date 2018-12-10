/**
* @author Owen Perry 
* @version 1.0
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Calculator extends JFrame {
	private static String num = new String();
	private static ArrayList<String> numList = new ArrayList<String>(); // this will store the numbers used to calculate
																	// adds an empty string at index 0
	private static int decCheck = 0;								// this is used as a counter for the loop which makes 
																	//  sure there is only one decimal per inputted number
	private static int calcCheck = 0;

	private static JTextField field = new JTextField();

	private static JButton sevButton = new JButton("7");
	private static JButton eigButton = new JButton("8");
	private static JButton ninButton = new JButton("9");
	private static JButton addButton = new JButton("+");
	private static JButton fouButton = new JButton("4");
	private static JButton fivButton = new JButton("5");
	private static JButton sixButton = new JButton("6");
	private static JButton subButton = new JButton("-");
	private static JButton oneButton = new JButton("1");
	private static JButton twoButton = new JButton("2");
	private static JButton thrButton = new JButton("3");
	private static JButton divButton = new JButton("/");
	private static JButton zerButton = new JButton("0");
	private static JButton decButton = new JButton(".");
	private static JButton ceButton = new JButton("CE");
	private static JButton mulButton = new JButton("*");
	private static JButton calcButton = new JButton("Calculate");
	
	public static void numPress(String n) {
		if (n == "."  && decCheck == 0){
			num += n;
			decCheck++;
		} if (n == "." && decCheck != 0) {
			num = num;
		} else {
			num += n;
		} 
		if (numList.size() > 1) {
			calcCheck++;
		}
		field.setText(num);
		setEnabledMethod(true);
	}
	public static void doSomeMath(String operator) {
		numList.add(num);//send num to arraylist
		//if (numList.get(numList.size()-1) == "*" && numList.get(numList.size()-1) == "/" && numList.get(numList.size()-1) == "+" && numList.get(numList.size()-1) == "-"){
		//	numList.remove(numList.size()-1);
		//} else {
			field.setText("");
			numList.add(operator);//send + after previous num to arraylist
			num = "";//clear num		
		//}
	}
	public static void setEnabledMethod(Boolean n) {
		if (n == true){
			addButton.setEnabled(true);	
			subButton.setEnabled(true);
			divButton.setEnabled(true);
			mulButton.setEnabled(true);
			 if (calcCheck > 0) {
				calcButton.setEnabled(true);
			}
		} else {
			addButton.setEnabled(false);	
			subButton.setEnabled(false);
			divButton.setEnabled(false);
			mulButton.setEnabled(false);
			calcButton.setEnabled(false);
			calcCheck = 0;
		}
	}

	public static void main(String[] args) {
		//numList.add("");
		JFrame buttonFrame = new JFrame();

		buttonFrame.getContentPane();
		buttonFrame.setTitle("Calculator");
		setEnabledMethod(false);

		sevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("7");
        	}		
		});
		eigButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				numPress("8");
        	}		
		});
		ninButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("9");
        	}		
		});
		fouButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("4");
        	}		
		});
		fivButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("5");
        	}		
		});
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("6");
        	}		
		});
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("1");
        	}		
		});
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("2");
        	}		
		});
		thrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("3");
        	}		
		});
		zerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numPress("0");
        	}		
		});
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				numPress(".");
   				field.setText(num);
        	}		
		});
		ceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   				num = "";
   				numList.clear();
   				decCheck = 0;
   				field.setText(num);
				setEnabledMethod(false);
        	}		
		});
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSomeMath("+");
        	}
		});
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSomeMath("-");
        	}		
		});
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSomeMath("/");
        	}		
		});
		mulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSomeMath("*");
        	}		
		});
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double output = 0.00;
				String output2 = "";
				field.setText("");
				numList.add(num);//send num to arraylist
				//loop which starts at index 1 and takes each item and adds if its not a +, -, /, 
				// or * and if it is, then takes previous number and peforms calculation,
				if (numList.size() > 1) {
					for (int i = 0; i < numList.size(); i++) {
						if (numList.get(1) == "*") {
								output = Double.parseDouble(numList.get(0)) * Double.parseDouble(numList.get(2));
								output2 = Double.toString(output);
								numList.add(0, output2);
								numList.remove(1);
								numList.remove(1);
								numList.remove(1);
						} 
						if(numList.size() > 2){
							if (numList.get(1) == "/") {
								output = Double.parseDouble(numList.get(0)) / Double.parseDouble(numList.get(2));
								output2 = Double.toString(output);
								numList.add(0, output2);
								numList.remove(1);
								numList.remove(1);
								numList.remove(1);
							} 
						}
						if(numList.size() > 2){
							if (numList.get(1) == "+") {
								output = Double.parseDouble(numList.get(0)) + Double.parseDouble(numList.get(2));
								output2 = Double.toString(output);
								numList.add(0, output2);
								numList.remove(1);
								numList.remove(1);
								numList.remove(1);
							} 
						}
						if(numList.size() > 2){
							if (numList.get(1) == "-") {
							output = Double.parseDouble(numList.get(0)) - Double.parseDouble(numList.get(2));
								output2 = Double.toString(output);
								numList.add(0, output2);
								numList.remove(1);
								numList.remove(1);
								numList.remove(1);
							} 
						}
					}
					field.setText(output2);
					setEnabledMethod(false);
				}
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
		buttonFrame.pack();
		buttonFrame.setVisible(true);
	}
}