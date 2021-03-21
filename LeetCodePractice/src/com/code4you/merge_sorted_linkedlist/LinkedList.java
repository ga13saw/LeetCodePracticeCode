package com.code4you.merge_sorted_linkedlist;

public class LinkedList {
	private Node head;
	private static int length;
	
	public LinkedList() {
		length = 0;
	}
	
	public void append(int data) {
		if(head == null){
			head = new Node(data);
			length++;
			return;
		}
		
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		length++;
		
	}
	
	public int remove() {
		Node tem_node = head;
		if (tem_node!=null) {
			head = head.next;
			length--;
			return tem_node.data;
		}
		
		return -1;
		
	}
	
	public void printList(){
		Node tem_node = head;
		while(tem_node != null){
			System.out.print(tem_node.data+" ");
			tem_node = tem_node.next;
		}
		System.out.println();
	}

	public int length() {
		return length;
	}

	public void append(int index, int data) {
		Node index_node = new Node(data);
		Node tem_node = head;
		int tem_length = 1;
		while(tem_length != index){
			
			tem_node = tem_node.next;
			tem_length += 1;
		}
		
		index_node.next = tem_node.next;
		tem_node.next = index_node;
		length++;
	}
	
	public LinkedList reverse() {
		LinkedList list = new LinkedList();
		while (head !=null) {
			list.append(remove());
		}
		
		list.printList();
		return list;
	}
	
	public Node getFirst() {
		return head;
	}
	//1 2 4 ,  1 3 4
	 public Node mergeTwoLists(Node l1, Node l2) {
		Node result = new Node(0);
		Node resulthead =result;
		
		 while (true) {
			 /*if (l1==null && l2==null) {
				return l1;
			}*/
			 
			 if (l1==null) {
				result.next=l2;
				break;
			}
			 if (l2==null) {
				result.next=l1;
				break;
			}
			 if (l1.data<=l2.data) {
					result.next = l1;
					
					l1=l1.next;
					
				}
			 else {
				 result.next = l2;
				 
				 l2=l2.next;
				}
			 result=result.next;
		}
			
			
		
		 
		 return resulthead.next;
	        
	    }

	
}




















