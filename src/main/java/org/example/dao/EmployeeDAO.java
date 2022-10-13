package org.example.dao;

import org.example.model.Employee;

import java.sql.*;

public class EmployeeDAO {

    public Employee getEmployeeByEmployeeID(int employeeID, Connection c) throws SQLException {

        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Employee WHERE EmployeeID = " + employeeID);

        Employee dbEmp = null;
        while (rs.next()) {
            dbEmp = new Employee(rs.getInt("EmployeeID"),
                    rs.getString("Forename"), rs.getString("Surname"),
                    rs.getFloat("Salary"), rs.getString("BankAccountNum"),
                    rs.getString("SortCode"), rs.getString("NIN"),
                    rs.getString("EmployeeTelNo"), rs.getString("EmployeeEmail"));
        }
        return dbEmp;

    }

    public Employee getAllEmployees(Connection c) throws SQLException {

        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Employee");

        Employee dbEmp = null;
        while (rs.next()) {
            dbEmp = new Employee(rs.getInt("EmployeeID"),
                    rs.getString("Forename"), rs.getString("Surname"),
                    rs.getFloat("Salary"), rs.getString("BankAccountNum"),
                    rs.getString("SortCode"), rs.getString("NIN"),
                    rs.getString("EmployeeTelNo"), rs.getString("EmployeeEmail"));
        }
        return dbEmp;
    }

    public void insertEmployee(Employee e, Connection c) throws SQLException {

        String insertQuery = "INSERT INTO Employee VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = c.prepareStatement(insertQuery);
        preparedStatement.setInt(1, e.getEmployeeID());
        preparedStatement.setString(2, e.getForename());
        preparedStatement.setString(3, e.getSurname());
        preparedStatement.setFloat(4, e.getSalary());
        preparedStatement.setString(5, e.getBankAccountNum());
        preparedStatement.setString(6, e.getSortCode());
        preparedStatement.setString(7, e.getNIN());
        preparedStatement.setString(8, e.getEmployeeTelNo());
        preparedStatement.setString(9, e.getEmployeeEmail());

        preparedStatement.executeUpdate();
    }
}
