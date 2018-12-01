import java.awt.*;
import javax.swing.*;

public class RadioButtonClass extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new MultiRadioButton());
		new MultiRadioButton();
	}
}
