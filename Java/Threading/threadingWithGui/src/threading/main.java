package threading;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main extends JFrame implements ActionListener{
	
	public static void main(String[] args) {		
		new main();
	}

	Thread t1;
	Thread t2;
	threadObject threadObject1;
	threadObject threadObject2;
	JButton btn_one;
	JButton btn_two;
	
	public main(){
		setupFrame();
		
		threadObject1 = new threadObject("thread 1");
		threadObject2 = new threadObject("thread 2");
		
		t1 = new Thread(threadObject1);
		t2 = new Thread(threadObject2);
		
		
	}
	
	private void setupFrame(){
		setPreferredSize(new Dimension(400,400));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		btn_one = new JButton("Start 1");
		btn_two = new JButton("Start 2");
		
		btn_one.addActionListener(this);
		btn_two.addActionListener(this);
		
		
		this.add(btn_one);
		this.add(btn_two);
		
		
		
		setVisible(true);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_one){
			if(threadObject1.getThreadState()){
				btn_one.setText("Start 1");
			}else{
				btn_one.setText("Stop 1");
				threadObject1.setThreadState(threadObject.RUNNING);
			}
		}
		
	}
	
}
