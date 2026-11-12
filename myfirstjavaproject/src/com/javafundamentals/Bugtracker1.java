package com.javafundamentals;

public class Bugtracker1 {
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assigneddeveloper;
	
	int getbugid() {
		return bugid;
	}
	String getapplicationname() {
		return applicationname;
	}
	String getbugtitle() {
		return bugtitle;
	}
	String getseverity() {
		return severity;
	}
	String getpriority() {
		return priority;
	}
	String getstatus() {
		return status;
	}
	String getassigneddeveloper() {
		return assigneddeveloper;
	}
	void assignedtodeveloper(int bugId,String developerName) {
		bugid=bugId;
		assigneddeveloper=developerName;
		updatestatus("In development");
		}

	void updatestatus(String newstatus) {
		status=newstatus;
	
	}
	void displayBugsummary()
	{
		System.out.println("Bug Id:"+getbugid());
		System.out.println("Application Name:"+getapplicationname());
		System.out.println("Bug Title:"+getbugtitle());
		System.out.println("Severity:"+getseverity());
		System.out.println("Priority:"+getpriority());
		System.out.println("Status:"+getstatus());
		System.out.println("Assigned Developer:"+getassigneddeveloper());
		System.out.println("------------------------------------------------");
	}
	public static void main(String[] args) {
		Bugtracker1 b1=new Bugtracker1();
		b1.bugid=01;
		b1.applicationname="Banking app";
		b1.bugtitle="Login error";
		b1.priority="Urgent";
		b1.severity="High";
		b1.status="Open";
		b1.assigneddeveloper="Not Assigned";
		
		
		Bugtracker1 b2=new Bugtracker1();
		b2.bugid=02;
		b2.applicationname="Shopping app";
		b2.bugtitle="Payment failure";
		b2.priority="Urgent";
		b2.severity="Critical";
		b2.status="Open";
		b2.assigneddeveloper="Not Assigned";
		
		b1.assignedtodeveloper(01,"Kaushal");
		b2.assignedtodeveloper(02,"Karthik");
		
		b1.displayBugsummary();
		b2.displayBugsummary();
		
		
		
		
		
		

	}

}
