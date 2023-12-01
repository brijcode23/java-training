package com.sismos.complaints;

//create 6 fields complaintId,name,mailid, mobileNumber,description, status. implement encapsulation principles
public class Complaints {
    // Private fields to encapsulate data
    private int complaintId;
    private String name;
    private String mailId;
    private String mobileNumber;
    private String description;
    private String status;

    // Constructor to initialize the fields
    public Complaints(int complaintId, String name, String mailId, String mobileNumber, String description, String status) {
        this.complaintId = complaintId;
        this.name = name;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
        this.description = description;
        this.status = status;
    }

    // Getter methods to access the private fields
    public int getComplaintId() {
        return complaintId;
    }

    public String getName() {
        return name;
    }

    public String getMailId() {
        return mailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    // Setter methods to modify the private fields
    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

