package DecoratedTree;

public class TreeFrasetFir extends Tree {
	
	public TreeFrasetFir(){
		TreeDescription = "Fraset Fir Tree";
	}
	
	@Override
	public double cost() {
		return Constants.FraserFir;
	}

}
