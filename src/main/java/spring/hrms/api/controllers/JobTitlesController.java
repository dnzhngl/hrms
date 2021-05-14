package spring.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.hrms.business.abstracts.JobTitleService;
import spring.hrms.entities.concretes.JobTitle;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
    private JobTitleService jobTitleService;
    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody JobTitle jobTitle){
        jobTitleService.add(jobTitle);
    }

    // Empty method
    @PostMapping("/update")
    public void update(@RequestBody JobTitle jobTitle){
        jobTitleService.update(jobTitle);
    }
}
