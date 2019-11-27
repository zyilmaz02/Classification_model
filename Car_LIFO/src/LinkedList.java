import java.util.Scanner;

public class LinkedList {
	
	public Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public void append(Car item) {
		Node X= new Node(item);
		if(head == null) {
			head = X;
		}
		else {
			X.link=head;
			head= X;
			
		}
	}
	
	public void print() {
		Node x =head;
		while (x != null) {
			System.out.printf("Make = %s Model= %s year= %d Mileage=%d Price=%.2f",x.item.make,x.item.model,x.item.year,x.item.mileage,x.item.price);
			System.out.print("\n");
			x= x.link;
		}
	}
	public Node remove() {
		Node temp=head;
		if(temp == null)
			System.out.println("there is no car;");
		else
			head=head.link;
		
		return temp;
	}
	
}
