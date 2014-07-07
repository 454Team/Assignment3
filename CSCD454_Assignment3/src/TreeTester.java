/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 3: Decorator Pattern
 * For the Star, I've implemented the Singleton Pattern to create one instance of the star. 
 * I had to maintain two separate booleans to keep track of printing the star description and star cost only once per tree.
 * The Singleton Pattern helped me successfully add only one star per tree.
 */
import java.text.DecimalFormat;


public class TreeTester {

	public static void main(String[] args) {
		/* Blue Spruce Test */
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		printtree(mytree);
		
		mytree = new Star(mytree);
		printtree(mytree);
		/* End Blue Spruce Test */
		
		
		/* Douglas Fir Test */
		System.out.println();
		Tree yourtree = new DouglasFir();
		yourtree = new Star(yourtree);
		yourtree = new Star(yourtree);
		yourtree = new Star(yourtree);
		yourtree = new BallsRed(yourtree);
		yourtree = new Ribbons(yourtree);
		yourtree = new Star(yourtree);
		yourtree = new LEDs(yourtree);
		yourtree = new BallsBlue(yourtree);
		printtree(yourtree);
		
		mytree = new Star(yourtree);
		printtree(yourtree);
		/* End Douglas Fir Test */
		
		/* Colorado Blue Spruce Test (No Star)*/
		System.out.println();
		Tree starlesstree = new FraserFir();
		starlesstree = new Lights(starlesstree);
		starlesstree = new BallsSilver(starlesstree);
		starlesstree = new Ruffles(starlesstree);
		printtree(starlesstree);
		/* End Blue Spruce Test */
		

	}// End main

	private static void printtree(Tree tree) {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(tree.getDescription() + " costs $" + df.format(tree.cost()));
	}// End printtree

}// End class
