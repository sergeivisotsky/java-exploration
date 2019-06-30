package org.sergei.core.instanceofexp;

/**
 * @author Sergei Visotsky
 */
public class Employee extends HumanInstanceOf {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;
    private Integer performance;
    
    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, Integer age) {
        super(id, firstName, lastName, age);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }
    
}
