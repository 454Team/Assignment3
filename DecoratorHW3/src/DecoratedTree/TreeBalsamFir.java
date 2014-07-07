package DecoratedTree;

public class TreeBalsamFir extends Tree {

	public TreeBalsamFir(){
		TreeDescription = "Balsam Fir tree";
	}
	
	
	@Override
	public double cost() {
		return Constants.BalsamFir;
	}

}
