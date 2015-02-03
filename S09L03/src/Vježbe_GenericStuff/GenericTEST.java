package Vježbe_GenericStuff;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.LinkedList;


public class GenericTEST {

	public static void main(String[] args) {
		
		GenericLinkedList<Integer> list = new GenericLinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		Iterator<Integer> benjo = list.iterator();
		while(benjo.hasNext()) System.out.println(benjo.next());
		
		System.out.println();
		System.out.println("#####################################");
		System.out.println();
		
		LinkedList<Integer> test2 = new LinkedList<Integer>();
		test2.add(50);
		test2.add(100);
		test2.add(150);
		Iterator<Integer> benjo2 = test2.iterator();
		while(benjo2.hasNext()) System.out.println(benjo2.next());
	}
	
}
