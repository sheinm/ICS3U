  package behaviors;

  import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
  

public class Main {
public static void main(String[] args) {	
	Behavior b1 = new RunForward();
	Behavior b2 = new endProgram();
	Behavior b3 = new SenseCup();
	Behavior b4 = new Stop(); 
	Behavior b5 = new flipCup();
	Behavior b6 = new HitObject();
	Behavior [] behaviors = {b1, b2, b3, b4, b5, b6};
	Arbitrator arby = new Arbitrator (behaviors);

	
	
}

}
