import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;


public class mainwindow extends JFrame{

	public mainwindow(){
		
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(800,600));
		addComponents();
		
		this.pack();
		this.setVisible(true);
	}
	
	private void addComponents(){
		this.add(new subwindow("Wouter", "SChipperheijn"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Titel", "text"));
		this.add(new subwindow("Wouter", "HP + 10"));
	}
	
}
