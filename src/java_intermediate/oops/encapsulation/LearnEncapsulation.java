package java_intermediate.oops.encapsulation;

public class LearnEncapsulation {

    /*
     Data Hiding
        NO ACCESS
        READ-ONLY ACCESS
        READ/WRITE ACCESS
     */

    String studentName = "Luc";
    String studentId = "7437NJ";
    private String employeeId = "12345ABCD";
    private int salary = 65000;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
