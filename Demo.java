package datastructures;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Linked_List{
	Node head;
	public void print() {
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public void add(int i) {
		Node temp = new Node(i);
		if(head==null) {
			head=temp;
		}
		else {
			Node cur=head;
			while(cur.next != null) {
				cur=cur.next;
			}
			cur.next=temp;
		}
		
	}
	public void addBegin(int i) {
		Node temp = new Node(i);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;
			
		}
		
	}

	public void addAtPos(int ele, int pos) {
		Node temp=new Node(ele);
		if(pos<=0) return;
		if(pos==1 || head==null ) {
			temp.next=head;
			head=temp;
			return;
		}
		Node curr=head;
		int count=1;
		while(curr.next!=null && count<pos-1) {
			curr=curr.next;
			count++;
		}
		temp.next=curr.next;
		curr.next=temp;
		
	}
}
public class LinkedList {

	public static void main(String[] args) {
		Linked_List l= new Linked_List();
		l.add(10);
		l.add(20);
		l.add(59);
		l.add(30);
		l.add(70);
		l.addBegin(100);
		l.addAtPos(500,3);
		l.addAtPos(1,5);
		l.print();

	}

}



