package spring.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.hrms.business.abstracts.EmployeeService;
import spring.hrms.entities.concretes.Employee;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        employeeService.add(employee);
    }

    @PutMapping("/update")
    public void update(@RequestBody Employee employee){
        employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Employee employee){
        employeeService.delete(employee);
    }

    @GetMapping("/getbyid/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}
