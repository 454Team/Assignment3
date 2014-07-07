package DecoratedTree;

public class TreeColoradoBlueSpruce extends Tree {

	public TreeColoradoBlueSpruce(){
		TreeDescription = "Colorado Blue Spruce";
	}
	
	@Override
	public double cost() {
		return Constants.ColoradoBlueSpruce;
	}

}
