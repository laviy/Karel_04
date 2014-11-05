/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {
     public static void takeTheField(Athlete arg) {
         arg.move();
         arg.move();
         arg.move();
         arg.move();
         arg.turnRight();
         arg.move();
         arg.move();
     }
     
     public static void main(String[] args) {
         Display.openWorld("maps/arena.map");
         Display.setSize(10, 10);
         Display.setSpeed(5);
         Athlete karel = new Athlete();
         Athlete bob = new Athlete();
         Athlete jerry = new Athlete();
         Athlete tom = new Athlete();
         Athlete maria = new Athlete();
         Athlete mary = new Athlete();
         Athlete coach = new Athlete(1, 7, Display.EAST, 0);
         takeTheField(karel);
         takeTheField(bob);
         takeTheField(jerry);
         takeTheField(tom);
         takeTheField(maria);
         takeTheField(mary);
         karel.move();
         karel.turnLeft();
         karel.move();
         karel.turnAround();
         bob.move();
         bob.move();
         bob.turnRight();
         jerry.move();
         jerry.move();
         jerry.move();
         jerry.turnRight();
         tom.move();
         tom.move();
         tom.move();
         tom.move();
         tom.turnRight();
         maria.move();
         maria.move();
         maria.move();
         maria.move();
         maria.move();
         maria.turnLeft();
         maria.move();
         maria.turnAround();
         mary.move();
         mary.move();
         mary.move();
         mary.turnLeft();
         mary.move();
         mary.move();
         mary.turnAround();
          
     }
}
