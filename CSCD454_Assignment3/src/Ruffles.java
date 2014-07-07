/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class Ruffles extends OrnamentDecorator {

	Tree tree;
	
	public Ruffles(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", Ruffles";
	}// End getDescription
	
	@Override
	public double cost() {
		return 1 + tree.cost();
	}// End cost

}// End class
