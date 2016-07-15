package threading;

import java.util.Random;

public class threadObject implements Runnable{
	
	String name;
	int millis;
	Random r = new Random();
	boolean threadState;
	
	public static boolean RUNNING = true;
	public static boolean DEAD = false;
	
	
	public threadObject(String name){
		setName(name);
		setThreadState(DEAD);
		setMillis(getR().nextInt(1000));
	}

	@Override
	public void run() {
		boolean var = true;
		while(true){
			if(getThreadState()){
				try{
					System.out.println(getName() + " is sleeping for " + getMillis() + "ms");
					Thread.sleep(getMillis());
					System.out.println(getName() + " wakes up");
				}catch(Exception e){
					e.printStackTrace();
				}	
			}
		}
		
	}

	
	
	
	public boolean getThreadState() {
		return threadState;
	}

	public void setThreadState(boolean state) {
		this.threadState = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMillis() {
		return millis;
	}

	public void setMillis(int millis) {
		this.millis = millis;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}
	
	
	
	
	
}
