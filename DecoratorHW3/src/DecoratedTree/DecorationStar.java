package DecoratedTree;

public class DecorationStar extends Decoration {
	
	private Tree tree;
	private boolean checkedStar = true;
	public DecorationStar(Tree tree){
		
		if(tree.hasStar == false){		// no star in it yet
			checkedStar = false;
			
		}
		else{
			System.out.println("Tree already has a star in it");
		}	
			tree.setStar(true);			// right now it has 1 in it
			setStar(true);
			this.tree = tree;
	}
	
	@Override
	public String getTreeDescription() {
		if(checkedStar == false)
			return tree.getTreeDescription() + " with Star";
		return tree.getTreeDescription();
	}

	@Override
	public double cost() {
		
		if(checkedStar == false)
			return tree.cost() + Constants.Star;
		else
			return tree.cost();
	}

}
