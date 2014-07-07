package DecoratedTree;

public class DecorationRuffles extends Decoration {

private Tree tree;
	
	public DecorationRuffles(Tree tree){
		this.tree = tree;
	}
	
	@Override
	public String getTreeDescription() {
		return tree.getTreeDescription() + " with Ruffles"; 
	}

	@Override
	public double cost() {

			return tree.cost() + Constants.Ruffles;

	}

}
