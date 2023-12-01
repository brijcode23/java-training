package com.sismos.complaints;

//Create a collection to store complaints objects. Create a method to save the complaint. 
//this complaint method takes complaint object as input and adds the complaint id to complaint object, and updates the status as open
//after successful save,it should return the complaint id back

//Ceate other method to getOpenComplaints this method returns all the complaint objects of status open getOpenComplaints method

import java.util.ArrayList;
import java.util.List;

public class ComplaintDAO {
    private static List<Complaint> complaintList = new ArrayList<>();
    private static int nextComplaintId = 1;

    // Method to save the complaint
    public int saveComplaint(Complaint complaint) {
        // Assign a unique complaint ID and update status
        int complaintId = nextComplaintId++;
        complaint.setComplaintId(complaintId);
        complaint.setStatus("Open");

        // Add the complaint to the collection
        complaintList.add(complaint);

        // Return the complaint ID
        return complaintId;
    }

    // Method to get all open complaints
    public String getOpenComplaints() {
        StringBuilder result = new StringBuilder();
        for (Complaint complaint : complaintList) {
            if ("Open".equals(complaint.getStatus())) {
                result.append("Complaint ID: ").append(complaint.getComplaintId()).append(", ");
                result.append("Name: ").append(complaint.getName()).append(", ");
                result.append("Description: ").append(complaint.getDescription()).append("<br>");
            }
        }
        return result.toString();
    }
}
