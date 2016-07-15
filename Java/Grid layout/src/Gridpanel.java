import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Gridpanel extends JPanel {

	public Gridpanel(){
		this.setLayout(new GridLayout(2,2));
	
		this.add(new Colourpanel(Color.yellow));
		this.add(new Colourpanel(Color.blue));
		this.add(new Colourpanel(Color.red));
		this.add(new Colourpanel(Color.green));
		
	}
}
