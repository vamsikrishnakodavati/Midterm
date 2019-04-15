package takehome;


public class Worker {
	private long workerID;
	
	public Worker(long workerID) {
		this.workerID = workerID;
	}
	
	public long getWorkerID() { return workerID; }
	
	public String notify(WorkItem workitem) {
		if (workitem.getItemID().equals(Long.toString(workerID))) {
			String message = "Worker " + 
							workerID +  
							" processed WorkItem " +
							workitem.getItemID() +
							" message " +
							workitem.getMessage();
			int iteID = Integer.parseInt(workitem.getItemID()) + 1;
			workitem.setItemID(Integer.toString((iteID)));
			
			return message;
		}
		return null;
	}
}
