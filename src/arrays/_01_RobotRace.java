package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	boolean gameOver = false;
	Robot[] robots = new Robot[5];
	int y = 750;
	int x = 100;
	Random ran = new Random();
	for (int i = 0; i < robots.length; i++) {
		robots[i] = new Robot();
		robots[i].moveTo(x, y);
		robots[i].setSpeed(10);
		x+=150;
	}
	Robot.setWindowSize(800, 800);
	while (gameOver == false) {
	for (int i = 0; i < robots.length-1; i++) {
		robots[ran.nextInt(5)].move(ran.nextInt(50));
		if(robots[i].getY()<=0) {
			gameOver = true;
			JOptionPane.showMessageDialog(null, "The winner is Robot #" + (i+1) + ". Now go throw a party");
		}
	}
	}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
