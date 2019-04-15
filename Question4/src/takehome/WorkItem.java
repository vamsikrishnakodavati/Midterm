package takehome;


public class WorkItem {
	String iteID;
	long workerID;
	String message;
	
	public WorkItem(String itemID, long workerID, String message) {
		this.iteID = itemID;
		this.workerID = workerID;
		this.message = message;
	}
	
	public String getItemID() { return iteID; }
	
	public void setItemID(String itemID) { this.iteID = itemID; }
	
	public long getWorkerID() { return workerID; }
	
	public String getMessage() { return message; }
}