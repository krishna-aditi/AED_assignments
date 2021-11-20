/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String empname;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setEmpname(String name) {
        this.empname = name;
    }

    
    public String getEmpName() {
        return empname;
    }

    @Override
    public String toString() {
        return empname;
    }
    
    
}
