package DecoratedTree;

public class DecorationLights extends Decoration {

	private Tree tree;

	public DecorationLights(Tree tree) {
		
		if(tree.hasStar == true){		// no star in it yet
			//tree.setStar(true);			// right now it has 1 in it
			setStar(true);
		}
		
		this.tree = tree;
	}

	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with Lights";
	}

	@Override
	public double cost() {

		return tree.cost() + Constants.Lights;

	}

}
