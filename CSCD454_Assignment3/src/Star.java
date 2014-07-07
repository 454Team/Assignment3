/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public class Star extends OrnamentDecorator {
	private volatile static Star instance = null;
	Tree tree;
	private static boolean hasStarDesc = false;
	private static boolean hasStarCost = false;
	
	private Star() {}
	
	public Star(Tree tree) {
		instance = Star.getInstance();
		this.tree = tree;
	}// End constructor
	
	private static Star getInstance() {
		
		if(instance == null)
			instance = new Star();
		else
			System.out.println("Tree already has a star!");
		
		hasStarCost = hasStarDesc = true;
		return instance;
			
	}// End getInstance

	@Override
	public String getDescription() {
		
		if(hasStarDesc)
		{
			hasStarDesc = false;
			return tree.getDescription() + ", a Star";
		}
		
		return tree.getDescription();
	}// End getDescription
	
	@Override
	public double cost() {
		if(hasStarCost)
		{
			hasStarCost = false;
			return 4 + tree.cost();
		}
		
		return tree.cost();
	}// End cost



}// End class
