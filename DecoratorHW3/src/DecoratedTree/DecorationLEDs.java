package DecoratedTree;

public class DecorationLEDs extends Decoration {

	private Tree tree;

	public DecorationLEDs(Tree tree) {
		
		if(tree.hasStar == true){		// no star in it yet
			//tree.setStar(true);			// right now it has 1 in it
			setStar(true);
		}
		
		this.tree = tree;
	}

	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with LEDs";
	}

	@Override
	public double cost() {

		return tree.cost() + Constants.LEDS;

	}

}
