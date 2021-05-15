package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {

    void add(JobTitle jobTitle);
    void update(JobTitle jobTitle);
    void delete(JobTitle jobTitle);
    JobTitle getById(int id);
    List<JobTitle> getAll();
}
