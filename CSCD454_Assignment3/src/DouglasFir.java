/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class DouglasFir extends Tree{

	public DouglasFir() {
		description = "Douglas Fir";
	}// End constructor
	
	@Override
	public double cost() {
		return 15.00;
	}// End cost

}// End class