/**
 * java.util.Queue interface is a subtype of java.util.Collection interface.
 * 
 * Just like a real-world queue (for instance, in a bank or at ATM), 
 * Queue inserts elements at the end of the queue and removes from the beginning of the queue.
 * 
 * Java Queue represents an ordered list of elements.
 * 
 * Java Queue follows FIFO order to insert and remove it’s elements. FIFO stands for First In First Out.
 * 
 * Java Queue supports all methods of Collection interface.
 * 
 * Most frequently used Queue implementations are LinkedList, ArrayBlockingQueue and PriorityQueue.
 * 
 * BlockingQueues do not accept null elements. If we perform any null related operation, it throws NullPointerException.
 * 
 * BlockingQueues are used to implement Producer/Consumer based applications.
 * 
 * BlockingQueues are thread-safe.
 * 
 * All Queues which are available in java.util package are Unbounded Queues and Queues which are available 
 * 
 * in java.util.concurrent package are Bounded Queues.
 * 
 * All Deques are not thread-safe.
 * 
 * ConcurrentLinkedQueue is an unbounded thread-safe Queue based on linked nodes.
 * 
 * All Queues supports insertion at the tail of the queue and removal at the head of the queue, except Deques.
 * 
 * Deques are queues but they support element insertion and removal at both ends.
 * 
 * Bounded Queues are queues which are bounded by capacity that means we need to provide the max size of 
 * the queue at the time of creation.
 * 
 * All Queues which are available in java.util package are Unbounded Queues and Queues which are available
 * in java.util.concurrent package are Bounded Queues.
 */

package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueInterfaceExamples {
	public static void main(String[] args) {

		// This is unbounded queue
		Queue<Integer> queue1 = new LinkedList<>();
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		System.out.println(queue1);
		System.out.println("-------------------------------------");

		Integer[] integerArr = null;
		Queue<Integer> queue2 = new LinkedList<>();
		queue2.add(11);
		queue2.add(22);
		queue2.add(33);
		queue2.add(44);
		integerArr = queue2.toArray(new Integer[queue2.size()]);
		for (int num : integerArr) {
			System.out.println(num);
		}
		System.out.println("-------------------------------------");

		// This is bounded queue
		try {
			BlockingQueue<Integer> queue3 = new ArrayBlockingQueue<>(2);
			System.out.println(queue3.add(10));
			System.out.println(queue3.add(20));
			System.out.println(queue3.add(30));
			System.out.println(queue3);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println("-------------------------------------");
		}

		BlockingQueue<Integer> queue4 = new ArrayBlockingQueue<>(2);
		System.out.println(queue4.offer(10));
		System.out.println(queue4.offer(20));
		System.out.println(queue4.offer(30));
	}
}
