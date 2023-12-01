package com.sismos.complaints;

//Extend this class with HTTPServlet and override doPost method to take the register form details from UI 
//and call DAO class saveComplaint. send response to UI as "Complaint registered successfully complaintID id"+complaintId 
//method to save the complaint. Override doGet method to return all the open complaints. Use DAO class getOpenComplaints method and 
//send response to UI

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/complaintServlet")
public class ComplaintServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters from the UI
        String name = request.getParameter("name");
        String mailId = request.getParameter("mailId");
        String mobileNumber = request.getParameter("mobileNumber");
        String description = request.getParameter("description");

        // Create a new Complaint object
        Complaint complaint = new Complaint(0, name, mailId, mobileNumber, description, "Open");

        // Call DAO class to save the complaint
        ComplaintDAO complaintDAO = new ComplaintDAO();
        int complaintId = complaintDAO.saveComplaint(complaint);

        // Send response to UI
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Complaint registered successfully. Complaint ID: " + complaintId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Call DAO class to get open complaints
        ComplaintDAO complaintDAO = new ComplaintDAO();
        String openComplaints = complaintDAO.getOpenComplaints();

        // Send response to UI
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Open Complaints:\n" + openComplaints);
    }
}
