/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class BalsamFir extends Tree{

	public BalsamFir() {
		description = "Balsam Fir";
	}// End constructor
	
	@Override
	public double cost() {
		return 5.00;
	}// End cost

}// End class
