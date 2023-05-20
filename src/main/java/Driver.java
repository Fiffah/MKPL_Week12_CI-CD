import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.incrementup();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrementdown();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
