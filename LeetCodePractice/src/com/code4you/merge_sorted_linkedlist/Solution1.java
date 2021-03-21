package com.code4you.merge_sorted_linkedlist;

public class Solution1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		list.append(4);
		list.append(3);
		list.append(1);
		list2.append(4);
		list2.append(2);
		list2.append(1);
		
		Node mergeList = mergeList(list,list2);
		while (mergeList!=null) {
			System.out.print(mergeList.data+"-->");
			mergeList=mergeList.next;
		}
		
	}

	private static Node mergeList(LinkedList list, LinkedList list2) {
		
		
		return list.mergeTwoLists(list.getFirst(), list2.getFirst());
		
		
	}

}
