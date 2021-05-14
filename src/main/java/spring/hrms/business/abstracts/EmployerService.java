package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Employer;

public interface EmployerService {

    void add(Employer employer);
    Employer getById(int id);
}
