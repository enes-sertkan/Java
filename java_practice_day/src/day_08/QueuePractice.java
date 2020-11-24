package day_08;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	
	/*
     * 1. Create Queue of Integer with object type if LinkedList : link
     * add the numbers: 45,54,26,63
     * print
     * remove the fist element without using any index(poll) and print
     * remove the next element and print
     * print the next element without removing
     * 
     * 2. Create:
     * Queue<Integer> pque = new PriorityQueue<>();
     * add the same numbers and print
     * use poll and peek functions to manipulate the data
     * 
     * 
     * 3. What is the major differences between LinkedList and PriorityQueue
     */
	
	public static void main(String[] args) {
		System.out.println("--------Queue--------");
		//Creating the object
		Queue<Integer> link = new LinkedList<>(); 
		link.add(45);
		link.add(54);
		link.add(26);
		link.add(63);
		System.out.println(link);
		//removing the element from the given order. FIFO(first in first out)
		link.poll();
		System.out.println(link);
		link.poll();// This will remove null if there is no element to be removed
		System.out.println(link);
		System.out.println(link.poll());// This return the number that is removed
		System.out.println(link);
		System.out.println(link.peek());//return next without removing
		System.out.println(link);
		
		System.out.println("--------Priority Queue--------");
		Queue<Integer> pque = new PriorityQueue<>();
		pque.add(45);
		pque.add(54);
		pque.add(26);
		pque.add(63);
		pque.add(10);
		System.out.println(pque);
		pque.poll();//will remove 10, the smallest number every time we call it
		System.out.println(pque);
		pque.poll();//remove 26
		System.out.println(pque);
		pque.poll();//remove 45
		System.out.println(pque);
		pque.poll();//remove 54
		System.out.println(pque);
		pque.poll();//remove 63
		System.out.println(pque);
		
//		System.out.println(pque.poll());// Remove 26
//		System.out.println(pque);
//		System.out.println(pque.peek());// print 45 without removing it
		
		
		//3. What is the major differences between LinkedList and PriorityQueue
		//LinkedList : FIFO order
		//PriorityQueue : Removes in natural order
		
		}
	
	

}
