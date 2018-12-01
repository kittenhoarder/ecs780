import java.awt.*;
import javax.swing.*;

public class RadioButtonClass extends JFrame implements ActionListener {
	private JRadioButton rRButton, gRButton, bRButton;

	public MultipleRadioButton() {

		super("Multiple Radio Buttons");

		rRButton = new JBRadioutton("Red");
		gRButton = new JBRadioutton("Green");
		bRButton = new JBRadioutton("Blue");

		rRButton.addActionListener( new redListener());
		gRButton.addActionListener( new greenListener());
		gRButton.addActionListener( new blueListener());

		this.getContentPane().add();
		this.getContentPane().add(this.rRButton, BorderLayout.EAST);
		this.getContentPane().add(this.gRButton, BorderLayout.SOUTH);
		this.getContentPane().add(this.bRButton, BorderLayout.WEST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MultiRadioButton();
	}
}