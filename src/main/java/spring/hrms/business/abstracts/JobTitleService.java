package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
    void add(JobTitle jobTitle);
    void update(JobTitle jobTitle);
}
