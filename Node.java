public class Node
{
	String data;
	Node next;

	public Node(String data){
	this.data = data;
	}

	public void tampil(){
		System.out.print("{"+data+"}");
	}
}