import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class FirstApplet extends Applet implements ActionListener {
	private Button clickMe;
	
	public void init() {
		clickMe = new Button("Click Me Not!");
		clickMe.addActionListener(this);
		add(clickMe);
		}
		
	public void actionPerformed(ActionEvent e) {
		if (clickMe.getLabel().equals("Click Me!"))
			clickMe.setLabel("Click Me Not!");
		else
			clickMe.setLabel("Click Me!");
		}	// end of actionPerformed
	
	}	// end of FirstApplet
