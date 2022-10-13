package org.example.resources;


import io.swagger.annotations.Api;
import org.example.dao.EmployeeDAO;
import org.example.model.Employee;
import org.example.util.DBConnection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/api")
@Api("Engineering Academy Dropwizard API")
public class WebService {

    @GET
    @Path("/print/{msg}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("msg") String message) {

        // Read employee ID from path
        // Get employee from DB
        // Map DB fields to employee instance
        // Return employee in response body

        Message myMessage = new Message("Hello from a RESTful Web service: " + message);
        return Response
                .status(Response.Status.OK)
                .entity(myMessage)
                .build();
    }

    @GET
    @Path("/employee/{getEmployee}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeByEmployeeID(@PathParam("getEmployee") int employeeID) throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        DBConnection conn = new DBConnection();

        Employee employeeByEmployeeID = dao.getEmployeeByEmployeeID(employeeID, conn.getConnection());

        return Response
                .status(Response.Status.OK)
                .entity(employeeByEmployeeID)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployees() throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        DBConnection conn = new DBConnection();

        Employee allEmployees = dao.getAllEmployees(conn.getConnection());

        return Response
                .status(Response.Status.OK)
                .entity(allEmployees)
                .build();
    }


    @POST
    @Path("/print")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendMsg(Message message) {
        return "Hello from a RESTful Web service: " + message.getText();
    }

    @POST
    @Path("/insertEmployee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String insertEmployee(Employee myEmp) throws SQLException{

        EmployeeDAO dao = new EmployeeDAO();
        DBConnection conn = new DBConnection();

        dao.insertEmployee(myEmp, conn.getConnection());
        return "Employee inserted into the database";
    }
}
