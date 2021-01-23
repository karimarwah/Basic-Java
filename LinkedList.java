public class LinkedList
{
	Node first;
	public LinkedList(){
	first=null;
	}

	public boolean isEmpty(){
	return(first==null);
	}

	public void addFirst(String data){
		Node node=new Node(data);
		node.next=first;
		first=node;
	}

	
	public void addLast(String data){
		Node node, help;
		node = new Node(data);
		node.next=null;
		if(isEmpty()){
			first = node;
			first.next = null;
		}
		else{
		help=first;
		while(help.next!=null){
			help=help.next;
		}
		help.next=node;
		}}

	//menghapus data dari simpul terakhir
	public Node deleteLast(){
	if(!isEmpty()){
		Node temp, current;
		current=first;
		while(current.next.next!=null){
			current=current.next;
		}
		temp=current.next;
		current.next=null;
		return temp;
	}
	else{
		Node temp=first;
		first=null;
		return temp;
	}
	}

	//menampilkan isilinked list
	public void tampilkan(){
		Node current = first;
		if(current==null){
			System.out.println("Kosong!");
		}
		else{
		while(current!=null){
			current.tampil();
			current = current.next;
		}
		System.out.println();
		}
	}

	//Sorting
	public void sort(){
		Node temp = first; 
		Node node;
		String tempData;
		while(temp != null){
			node = first;
			while(node.next != null ){
				if(node.data.compareTo(node.next.data)>0){
					//Swapping 
					tempData = node.data;
					node.data = node.next.data;
					node.next.data = tempData;
				}
				node = node.next;
			}
			temp = temp.next;
		}	
	}

	//Searching
	public void search(String key){
		Node temp = first;
		while(temp != null){
			if(temp.data.equalsIgnoreCase(key)){
				System.out.println("Data ditemukan");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Data tidak ditemukan");
		return;
	}


}
