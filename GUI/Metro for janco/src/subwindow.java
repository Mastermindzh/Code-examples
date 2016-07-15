import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class subwindow extends JPanel {

	public subwindow(String titel, String text){
		this.setLayout(new BorderLayout());
		
		this.setPreferredSize(new Dimension(100,100));
		this.setBackground(Color.GRAY);
		JLabel lbl_title = new JLabel(""+titel);
		JLabel lbl_text = new JLabel(""+text);
		
		this.add(lbl_title, BorderLayout.PAGE_START);
		this.add(lbl_text, BorderLayout.CENTER);
		
	}
}
