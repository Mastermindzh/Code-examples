import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Colourpanel extends JPanel {

	public Colourpanel(Color c){
		this.setBackground(c);
		this.setPreferredSize(new Dimension(100,100));
		this.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	}
}
