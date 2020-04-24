package objects;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import enums.OrderState;

public class Worker implements Runnable {
	
	final static int SIZE = 5;
	private BlockingQueue<Order> queue = new ArrayBlockingQueue<Order>(SIZE);
	
	public BlockingQueue<Order> getQueue() {
		return queue;
	}
	public void setQueue(BlockingQueue<Order> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Order order = queue.take();
				order.setState(OrderState.FULFILLED);
				System.out.println(order.getState().getMessage());
			}  catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
