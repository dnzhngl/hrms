package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Employee;

public interface EmployeeService {

    void add(Employee employee);
    Employee getById(int id);

}
