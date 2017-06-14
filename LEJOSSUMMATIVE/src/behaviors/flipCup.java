package behaviors;
import lejos.nxt.Motor; 
import lejos.robotics.subsumption.Behavior;

public class flipCup implements Behavior {
	private boolean suppressed = false;


	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action() {
		suppressed = true; 

	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}
