package org.example.service;

import org.example.dao.EmployeeDAO;
import org.example.model.Employee;
import org.example.util.DBConnection;

import java.sql.SQLException;

public class EmployeeService {

    public Employee getEmployee(int employeeId) throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();

        return dao.getEmployeeByEmployeeID(employeeId, DBConnection.getConnection());
    }
}
