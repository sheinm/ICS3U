package behaviors;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
public class RunForward implements Behavior {
	/**
	 * This program is to move forward, lowest priority 
	 * @author	Sheila Noriega
	 * Due June 15th 2017
	 */

	private boolean suppressed = false;

	public boolean takeControl() {
		return true;
	}
	
	/**
	 * This method suppress sends to the next behavior unless it is true, then sends to the action
	 */
	public void suppress() {
		suppressed = true;
	}
/**
 * if the suppress is not true, it will do the action. In this method, the action is to 
 * stop after being yielded. Otherwise, it will run forward. This is the last priority. 
 */
	public void action (){
		suppressed = false;
		Motor.A.forward ();
		Motor.C.forward ();
		while (!suppressed){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.C.stop(); 

}
}
