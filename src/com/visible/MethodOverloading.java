package com.visible;

	class LibraryManager {
	    public void recordInteraction(String interactionType) {
	        System.out.println("Interaction recorded: " + interactionType);
	    }
	    public void recordInteraction(String interactionType, String date) {
	        System.out.println("Interaction recorded: " + interactionType + " on " + date);
	    }    
	    public void recordInteraction(String interactionType, String date, int memberID) {
	        System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID);
	    }

	    public void recordInteraction(String interactionType, String date, int memberID, String condition) {
	        System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID + ", condition: " + condition);
	    }

	    public void recordInteraction(String interactionType, String date, int memberID, String condition, String notes) {
	        System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID + ", condition: " + condition + ", notes: " + notes);
	    }
	    }

	public class MethodOverloading{
	    public static void main(String[] args) {
	    LibraryManager manager = new LibraryManager();
	    manager.recordInteraction("Check Availability");
	    manager.recordInteraction("Borrow", "2023-07-25");
	    manager.recordInteraction("Return", "2023-08-01", 102);
	    manager.recordInteraction("Renew", "2023-07-30", 205, "Good", "Extended for 30 days");
	    }
	}

