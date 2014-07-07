/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 */
public abstract class Tree {
	String description = "Unknown Tree";
	
public String getDescription() {
	return description + " decorated with";
}// End getDescription

public abstract double cost();

}// End class
