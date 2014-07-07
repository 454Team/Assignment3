package DecoratedTree;

public class DecorationBlue extends Decoration {

	private Tree tree;

	public DecorationBlue(Tree tree) {
		
		if(tree.hasStar == true){		// no star in it yet
			//tree.setStar(true);			// right now it has 1 in it
			setStar(true);
		}
		
		this.tree = tree;
	}

	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with Ball Blue";
	}

	@Override
	public double cost() {

		return tree.cost() + Constants.BallsBlue;

	}

}
