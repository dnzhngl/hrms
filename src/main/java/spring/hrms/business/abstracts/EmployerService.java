package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Employee;
import spring.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    void add(Employer employer);
    void update(Employer employer);
    void delete(Employer employer);
    Employer getById(int id);
    List<Employer> getAll();
}
