import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Gui extends JFrame{
	
	private Gridpanel mainGrid = new Gridpanel();
	private JPanel colourpanels = new JPanel();
	public static void main(String[] args){
		new Gui();
	}

	public Gui(){
		this.setPreferredSize(new Dimension(500,349));
		this.setLayout(null);
		this.setTitle("Drag & Droptest");
		mainGrid.setBounds(150, 0, 200, 200);
		this.add(mainGrid);
		createColourpanels();
		colourpanels.setBackground(Color.gray);
		colourpanels.setBounds(0, 210, 500, 100);
		this.add(colourpanels);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void createColourpanels(){
		Colourpanel red = new Colourpanel(Color.red);
		Colourpanel blue = new Colourpanel(Color.blue);
		Colourpanel yellow = new Colourpanel(Color.yellow);
		Colourpanel green = new Colourpanel(Color.green);
		colourpanels.add(red);
		colourpanels.add(blue);
		colourpanels.add(yellow);
		colourpanels.add(green);
	}
	
}
