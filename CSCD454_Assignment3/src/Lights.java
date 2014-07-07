/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class Lights extends OrnamentDecorator {

	Tree tree;
	
	public Lights(Tree tree) {
		this.tree = tree;
	}// End constructor
	
	@Override
	public String getDescription() {
		return tree.getDescription() + ", Lights";
	}// End getDescription
	
	@Override
	public double cost() {
		return 5 + tree.cost();
	}// End cost

}// End class
