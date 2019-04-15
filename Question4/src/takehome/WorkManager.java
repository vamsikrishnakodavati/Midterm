package takehome;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Worker> workers = new ArrayList<Worker>();
	
	public WorkManager() {}
	
	public void registerWorker(Worker worker) { workers.add(worker); }
	
	public void removeWorker(Worker worker) { workers.remove(worker); }
	
	public void notify(WorkItem i) {
		for (Worker worker : workers) {
			if (worker.getWorkerID() <= 4) {
				String result = worker.notify(i);
				
				if (result != null) {
					System.out.println(result);
				}
			}
		}
	}
}