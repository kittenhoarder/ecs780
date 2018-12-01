import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class CatchMe extends JFrame {

	public static int randomExcluder(int i) {
		int aRandomInt = 0;
		Random r = new Random();

		while (aRandomInt == 0 && aRandomInt != i) {
			aRandomInt = r.nextInt(10);
		}
		return aRandomInt;
	}

	public static void main(String[] args) {

		JFrame buttonFrame = new JFrame();
		JLabel label = new JLabel("Catch me!");
		String buttonText = "Catch me!";
		double randomNum = 0;

		buttonFrame.getContentPane();
		buttonFrame.setTitle("Catch me!");

		JButton tlButton = new JButton();
		JButton tmButton = new JButton();
		JButton trButton = new JButton();
		JButton clButton = new JButton();
		JButton cmButton = new JButton();
		JButton crButton = new JButton();
		JButton blButton = new JButton();
		JButton bmButton = new JButton();
		JButton brButton = new JButton();
		

		tlButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
    			switch (randomExcluder(1)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		tmButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(2)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		trButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(3)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		clButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(4)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		cmButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(5)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		crButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(6)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		blButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(7)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		bmButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(8)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});
		brButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
				switch (randomExcluder(9)) {
		            case 1:  tlButton.setText(buttonText);
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 2:  tmButton.setText(buttonText);
		            		 tlButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 3:  trButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 4:  clButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 5:  cmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 6:  crButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 7:  blButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 bmButton.setText("");
							 brButton.setText("");
		                     break;
		            case 8:  bmButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 brButton.setText("");
		                     break;
		            case 9:  brButton.setText(buttonText);
		            		 tlButton.setText("");
							 tmButton.setText("");
							 trButton.setText("");
							 clButton.setText("");
							 cmButton.setText("");
							 crButton.setText("");
							 blButton.setText("");
							 bmButton.setText("");
		                     break;
		            //default:  ;
		             //        break;
		        }
   			}
		});

		JPanel buttonPanel = new JPanel(new GridLayout(3, 3));

		buttonPanel.add(tlButton);
		buttonPanel.add(tmButton);
		buttonPanel.add(trButton);
		buttonPanel.add(clButton);
		buttonPanel.add(cmButton);
		buttonPanel.add(crButton);
		buttonPanel.add(blButton);
		buttonPanel.add(bmButton);
		buttonPanel.add(brButton);

		buttonFrame.getContentPane().add(buttonPanel);

		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//buttonFrame.setSize(800, 600);
		buttonFrame.pack();
		buttonFrame.setVisible(true);
		System.out.println(randomExcluder(1));
		System.out.println(randomExcluder(9));
	}
}