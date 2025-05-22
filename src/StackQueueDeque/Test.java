package StackQueueDeque;

import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {

		MinStack minStack = new MinStack();

		minStack.push(10);
		minStack.push(20);
		minStack.push(30);
		minStack.push(40);

		System.out.println(minStack.getMin());

		minStack.pop();

		System.out.println(minStack.getMin());

		minStack.pop();

		System.out.println(minStack.getMin());

		minStack.pop();

		System.out.println(minStack.getMin());

		System.out.println("*******************");

		DesignCircularDeque myCircularDeque = new DesignCircularDeque(3);
		System.out.println(myCircularDeque.insertLast(1)); // return True
		System.out.println(myCircularDeque.insertLast(2)); // return True
		System.out.println(myCircularDeque.insertFront(3)); // return True
		System.out.println(myCircularDeque.insertFront(4));// return False, the queue is full.
		System.out.println(myCircularDeque.getRear()); // return 2
		System.out.println(myCircularDeque.isFull()); // return True
		System.out.println(myCircularDeque.deleteLast()); // return True
		System.out.println(myCircularDeque.insertFront(4)); // return True
		System.out.println(myCircularDeque.getFront());
		
		System.out.println("*********************************");
		
		Hashtable<Integer, Integer> hashtable=new Hashtable<Integer, Integer>();
		
		Integer put1 = hashtable.put(10, 20);
		Integer put2= hashtable.put(10, 20);
		Integer put3= hashtable.put(30, 30);
		
		System.out.println(put1);
		System.out.println(put2);
		System.out.println(put3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
