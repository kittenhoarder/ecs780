import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonClass extends JFrame {

	public static void main(String[] args) {
		JRadioButton rRButton, gRButton, bRButton;
		JFrame buttonFrame = new JFrame();
		JPanel colorPanel = new JPanel();

		buttonFrame.getContentPane();
		buttonFrame.setTitle("RGB Switcher");

		rRButton = new JRadioButton("Red");
		gRButton = new JRadioButton("Green");
		bRButton = new JRadioButton("Blue");

		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rRButton);
		bGroup.add(gRButton);
		bGroup.add(bRButton);

		rRButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
   				colorPanel.setBackground(new Color(255, 0, 0));
        	}		
		});
		
		gRButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
   				colorPanel.setBackground(new Color(0, 255, 0));
        	}		
		});

		bRButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
   				colorPanel.setBackground(new Color(0, 0, 255));
        	}		
		});
		
		setLayout(new GridLayout(2, 0));
		
		JPanel buttonPanel = new JPanel(new GridLayout(5, 3));
		buttonPanel.add(7Button);
		buttonPanel.add(8Button);
		buttonPanel.add(9Button);
		buttonPanel.add(4Button);
		buttonPanel.add(5Button);
		buttonPanel.add(6Button);
		buttonPanel.add(1Button);
		buttonPanel.add(2Button);
		buttonPanel.add(3Button);
		buttonPanel.add(0Button);
		buttonPanel.add(dButton);
		buttonPanel.add(cButton);

		buttonPanel.add(bRButton);
		buttonPanel.add(colorPanel);

		buttonFrame.getContentPane().add(radioPanel);

		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(400, 100);
		buttonFrame.setVisible(true);
	}
}