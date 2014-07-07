/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class LEDs extends OrnamentDecorator {

	Tree tree;
	
	public LEDs(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", LEDs";
	}// End getDescription
	
	@Override
	public double cost() {
		return 10 + tree.cost();
	}// End cost

}// End class