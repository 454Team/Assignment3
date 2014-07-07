/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class BallsSilver extends OrnamentDecorator {

	Tree tree;
	
	public BallsSilver(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", Balls Silver";
	}// End getDescription
	
	@Override
	public double cost() {
		return 3 + tree.cost();
	}// End cost

}// End class
