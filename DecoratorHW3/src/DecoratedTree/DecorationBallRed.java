package DecoratedTree;

public class DecorationBallRed extends Decoration {

	private Tree tree;

	public DecorationBallRed(Tree tree) {
		
		if(tree.hasStar == true){		// no star in it yet
			//tree.setStar(true);			// right now it has 1 in it
			setStar(true);
		}
		
		this.tree = tree;
	}

	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with Ball blue";
	}

	@Override
	public double cost() {

		return tree.cost() + Constants.BallsBlue;

	}

}
