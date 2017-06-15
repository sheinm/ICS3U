  package behaviors;

  import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
  

public class Main {
public static void main(String[] args) {	
	Behavior b1 = new RunForward();
	Behavior b2 = new SenseCup();
	Behavior b3 = new HitObject ();
	Behavior b4 = new endProgram();
	Behavior [] behaviors = {b1, b2, b3, b4};
	Arbitrator arby = new Arbitrator (behaviors);
	arby.start();
	
}

}
