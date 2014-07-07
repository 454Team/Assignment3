package DecoratedTree;

public class DecorationBallSilver extends Decoration {

	private Tree tree;

	public DecorationBallSilver(Tree tree) {
		
		if(tree.hasStar == true){		// no star in it yet
			//tree.setStar(true);			// right now it has 1 in it
			setStar(true);
		}
		
		this.tree = tree;
	}

	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with Ball silver";
	}

	@Override
	public double cost() {

		return tree.cost() + Constants.BallsSilver;

	}

}
