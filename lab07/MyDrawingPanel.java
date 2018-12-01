import java.awt.*;
import javax.swing.*;

public class MyDrawingPanel extends JPanel {

	public void paintComponent(Graphics g, int color) {
		g.setColor(Color.white);
		g.fillRect(0,0,this.getWidth(),this.getHeight());

 		Color redColor = new Color(255, 0, 0);
 		Color greenColor = new Color(0, 255, 0);
 		Color blueColor = new Color(0, 0, 255);

        Color colorChoice;
        switch (color) {
            case 1:  colorChoice = redColor;
                     break;
            case 2:  colorChoice = greenColor;
                     break;
            case 3:  colorChoice = blueColor;
                     break;
        }
        g.setColor(colorChoice)
		g.fillRect(50,50,80,50);
	}
} 