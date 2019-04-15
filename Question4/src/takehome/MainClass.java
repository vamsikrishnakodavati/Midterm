package takehome;


public class MainClass {
		public static void main(String[] args) {
			WorkManager manager = new WorkManager();
			Worker w1 = new Worker(1);
			Worker w2 = new Worker(2);
			Worker w3 = new Worker(3);
			Worker w4 = new Worker(4);
			manager.registerWorker(w1);
			manager.registerWorker(w2);
			manager.registerWorker(w3);
			manager.registerWorker(w4);
			
			WorkItem item1 = new WorkItem("1", 1, "Install the television");
			manager.notify(item1);
			
			WorkItem item3 = new WorkItem("2", 2, "Install the wiring");
			manager.notify(item3);
			
			WorkItem item4 = new WorkItem("3", 3, "Install the dishTV");
			manager.notify(item4);
		}
	}
