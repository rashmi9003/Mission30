package dataStructures.trees.data;


public class Tree {
	private int data;
	public Tree left = null;
	public Tree right = null;

	public Tree(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
