package objects;

public class Producer implements Runnable {
	
	private Worker worker;
	
	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			try {
				Order order = new Order();
				order.setId(i);
				worker.getQueue().put(order);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	};

}
