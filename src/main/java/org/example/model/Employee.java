package org.example.model;

public class Employee {
    private int employeeID;
    private String forename;
    private String surname;
    private float salary;
    private String bankAccountNum;
    private String sortCode;

    public Employee() {

    }

    private String NIN;
    private String employeeTelNo;
    private String employeeEmail;


    public Employee(int employeeID, String forename, String surname, float salary, String bankAccountNum, String sortCode, String NIN, String employeeTelNo, String employeeEmail) {
        this.setEmployeeID(employeeID);
        this.setForename(forename);
        this.setSurname(surname);
        this.setSalary(salary);
        this.setBankAccountNum(bankAccountNum);
        this.setSortCode(sortCode);
        this.setNIN(NIN);
        this.setEmployeeTelNo(employeeTelNo);
        this.setEmployeeEmail(employeeEmail);
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getNIN() {
        return NIN;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public String getEmployeeTelNo() {
        return employeeTelNo;
    }

    public void setEmployeeTelNo(String employeeTelNo) {
        this.employeeTelNo = employeeTelNo;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
