package org.example.autowiring;

public class Employee {
    private String id;
    private String name;
    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void employeeInfo(){
        System.out.println("Employee has the id: "+id);
        System.out.println("Employee has the name: "+ name);
        System.out.println("Employee is working in department: " +department);
    }
}
