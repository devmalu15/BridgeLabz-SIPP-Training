
public class TreeNode<T> {
	T data;
	List<TreeNode<T>> children;
	
	public TreeNode(T data){
		this.data = data;
		this.children = new ArrayList<>();
	}
	
	public T getData() {
		return data;
	}
	
	public T setData(T data) {
		this.data = data;
	}
	
	public void addChild(TreeNode<> child)

}
