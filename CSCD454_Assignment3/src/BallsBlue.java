/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class BallsBlue extends OrnamentDecorator {

	Tree tree;
	
	public BallsBlue(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", Balls Blue";
	}// End getDescription
	
	@Override
	public double cost() {
		return 2 + tree.cost();
	}// End cost

}// End class