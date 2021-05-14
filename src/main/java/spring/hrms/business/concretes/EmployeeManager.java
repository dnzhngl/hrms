package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.EmployeeService;
import spring.hrms.dataAccess.abstracts.EmployeeDao;
import spring.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Override
    public void add(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public Employee getById(int id) {
        return employeeDao.findById(id).orElse(null);
    }
}
