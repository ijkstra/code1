import objects.Producer;
import objects.Worker;

public class Test {
	
	public static void main(String[] args) {
		Worker worker = new Worker();
		Producer producer = new Producer();
		producer.setWorker(worker);
		
		Thread t1 = new Thread(worker);
		Thread t2 = new Thread(producer);
		
		t1.start();
		t2.start();
		
	}
}
