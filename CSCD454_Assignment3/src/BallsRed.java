/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class BallsRed extends OrnamentDecorator {

	Tree tree;
	
	public BallsRed(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", Balls Red";
	}// End getDescription
	
	@Override
	public double cost() {
		return 1 + tree.cost();
	}// End cost

}// End class