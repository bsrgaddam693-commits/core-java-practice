package javafundamentals;

public class Bugtracker {
	int bugid;
	String applicationName;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getBugid() {
		return  bugid;
	}
	String getApplicationName() {
		return applicationName;
	}
	String getBugtitle() {
		return bugtitle;
	}
	String getSeverity() {
		return severity;
	}
	String getPriority() {
		return priority;
	}
	String getStatus() {
		return status;
	}
	String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	
	void assignToDeveloper(int bugId,String developerName) {
		if(this.bugid==bugid) {
			this.assignedDeveloper=developerName;
			updateStatus("In Development");
		}
	}
	void updateStatus(String newStatus) {
		this.status=newStatus;
	}
	void displayBugSummary() {
		System.out.println("Bug Id:"+getBugid());
		System.out.println("Application Name:"+getApplicationName());
		System.out.println("Bug Title:"+getBugtitle());
		System.out.println("Severity:"+getSeverity());
		System.out.println("priority:"+getPriority());
		System.out.println("status:"+getStatus());
		System.out.println("Assigned Developer:"+getAssignedDeveloper());
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		Bugtracker bt=new Bugtracker();
		bt.bugid=501;
		bt.applicationName="Banking App";
		bt.bugtitle="Login Error";
		bt.severity="High";
		bt.priority="Urgent";
		bt.status="Open";
		bt.assignedDeveloper="Not Assigned";
		
		Bugtracker bt1=new Bugtracker();
		bt1.bugid=502;
		bt1.applicationName="Shopping App";
		bt1.bugtitle="Payment Failure";
		bt1.severity="Critical";
		bt1.priority="High";
		bt1.status="Open";
		bt1.assignedDeveloper="Not Assigned";
		
		bt.assignToDeveloper(501,"Kaushal");
		bt1.assignToDeveloper(502,"Karthik");
		
		bt1.displayBugSummary();
		bt.displayBugSummary();
				
	}
}
