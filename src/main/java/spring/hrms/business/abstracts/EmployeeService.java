package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    void add(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();

}
