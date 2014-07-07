/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class BlueSpruce extends Tree {

	public BlueSpruce() {
		description = "Blue Spruce";
	}// End constructor
	
	@Override
	public double cost() {
		return 20.00;
	}// End cost

}// End class
