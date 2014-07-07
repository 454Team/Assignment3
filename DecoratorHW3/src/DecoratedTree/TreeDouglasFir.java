package DecoratedTree;

public class TreeDouglasFir extends Tree {

	public TreeDouglasFir(){
		TreeDescription = "Douglas Fir tree";
	}
	
	@Override
	public double cost() {
		return Constants.DouglasFir;
	}

}
