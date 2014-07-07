/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class FraserFir extends Tree{

	public FraserFir() {
		description = "Fraser Fir";
	}// End constructor
	
	@Override
	public double cost() {
		return 12.00;
	}// End cost

}// End class