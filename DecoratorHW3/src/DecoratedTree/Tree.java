package DecoratedTree;

public abstract class Tree {
	protected String TreeDescription = "Unknown Description";

	protected boolean hasStar = false;

	public boolean checkStar() {
		return hasStar;
	}

	public void setStar(boolean star) {
		this.hasStar = star;
	}

	public String getTreeDescription() {
		return TreeDescription;
	}

	public abstract double cost();

}
